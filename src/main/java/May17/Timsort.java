package May17;

import java.util.Arrays;

    public class Timsort {

        private static final int MIN_MERGE = 32;

        public static void sort(int[] arr) {
            int n = arr.length;
            int[] aux = Arrays.copyOf(arr, n);
            timsort(arr, aux, 0, n - 1);
        }

        private static void timsort(int[] arr, int[] aux, int left, int right) {
            if (right - left < MIN_MERGE) {
                insertionSort(arr, left, right);
                return;
            }

            int mid = (left + right) / 2;
            timsort(arr, aux, left, mid);
            timsort(arr, aux, mid + 1, right);
            merge(arr, aux, left, mid, right);
        }

        private static void merge(int[] arr, int[] aux, int left, int mid, int right) {
            System.arraycopy(arr, left, aux, left, right - left + 1);

            int i = left;
            int j = mid + 1;
            int k = left;

            while (i <= mid && j <= right) {
                if (aux[i] <= aux[j]) {
                    arr[k] = aux[i];
                    i++;
                } else {
                    arr[k] = aux[j];
                    j++;
                }
                k++;
            }

            while (i <= mid) {
                arr[k] = aux[i];
                i++;
                k++;
            }

            while (j <= right) {
                arr[k] = aux[j];
                j++;
                k++;
            }
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

        public static void main(String[] args) {
            int[] arr = {9, 5, 1, 8, 3, 10, 4, 2, 7, 6};
            System.out.println("Before sorting: " + Arrays.toString(arr));
            Timsort.sort(arr);
            System.out.println("After sorting: " + Arrays.toString(arr));
        }
    }

