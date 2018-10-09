package chap02;

/**
 * Created by sunchao on 2018-10-9.
 */
public class InsertionSort {

    private InsertionSort() {}

    public static void sort(Comparable[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            /*for( int j = i; j > 0; j--) {
                if(arr[j].compareTo(arr[j - 1]) < 0) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }*/
            Comparable e = arr[i];
            int j = i;
            for(; j > 0 && arr[j - 1].compareTo(e) > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("chap02.InsertionSort", arr);
    }
}

