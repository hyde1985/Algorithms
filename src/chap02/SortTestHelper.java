package chap02;

/**
 * Created by sunchao on 2018-10-9.
 */
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
}
