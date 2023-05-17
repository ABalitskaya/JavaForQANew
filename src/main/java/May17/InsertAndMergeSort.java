package May17;

import java.util.Arrays;

public class InsertAndMergeSort {
    public static void main(String[] args) {

    }

    private static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public class MergeSort {
        public static void mergeSort(int[] arr) {
            if (arr.length <= 1) {
                return;
            }
            int mid = arr.length / 2;
            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];

            System.arraycopy(arr, 0, left, 0, left.length);
            System.arraycopy(arr, mid, right, 0, right.length);

            mergeSort(left);
            mergeSort(right);

            merge(arr, left, right);
        }

        private static void merge(int[] arr, int[] left, int[] right) {
            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }
            while (i < left.length) {
                arr[k++] = left[i++];
            }
            while (j < right.length) {
                arr[k++] = right[j++];
            }
        }

        public static void main(String[] args) {
            int[] arr = {9, 5, 1, 8, 3, 10, 4, 2, 7, 6};
            System.out.println("Before sorting: " + Arrays.toString(arr));
            mergeSort(arr);
            System.out.println("After sorting: " + Arrays.toString(arr));
        }
    }

}
