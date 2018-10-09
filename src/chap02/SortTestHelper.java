package chap02;

/**
 * Created by sunchao on 2018-10-9.
 */

import java.lang.reflect.Method;
import java.lang.Class;


public class SortTestHelper {

    private SortTestHelper() {}

    public static Integer[] generateRandomArray(int size, int rangeL, int rangeR) {
        assert rangeL <= rangeR;
        Integer[] arr = new Integer[size];
        for(int i = 0; i < size; i++) {
            int item = (int)(Math.random() * (rangeR - rangeL + 1) + rangeL);
            arr[i] = item;
        }
        return arr;
    }

    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print( arr[i] );
            System.out.print( ' ' );
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] arr) {
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void testSort(String sortClassName, Comparable[] arr){
       try {
           Class sortClass = Class.forName(sortClassName);
           Method sortMethod = sortClass.getMethod("sort",new Class[]{Comparable[].class});
           Object[] params = new Object[]{arr};
           long startTime = System.currentTimeMillis();
           sortMethod.invoke(null,params);
           long endTime = System.currentTimeMillis();

           assert isSorted( arr );

           System.out.println( sortClass.getSimpleName()+ " : " + (endTime-startTime) + "ms" );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
