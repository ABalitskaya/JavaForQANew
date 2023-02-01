package HWArrays;


public class Arrays {
    public static void main(String[] args) {
        int[] arrayTest = new int[] {66,55,4,6,5,3,2,7,6,5,3,8,122,256,3,2,4,5,0,0,3,4};
        //System.out.println(sumOfFirstAndLast(arrayTest).toString());


        sumOfElements(arrayTest);
        sumOfElements1(arrayTest);
        sumOfEvenInd(arrayTest);
        sumOfOddInd(arrayTest);
        int[] array2 = sumOfFirstAndLast(arrayTest);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

    }
    //Сумма элементов в массиве
    public static void sumOfElements (int[] array) {
        int sumOfElements = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfElements = sumOfElements + array[i];
        }
        System.out.println(sumOfElements);
    }

    // Сумма элементов в массиве (считается с конца
    public static void sumOfElements1 (int[] array){
        int sumOfElements = 0;
        for (int i = array.length-1; i > -1 ; i--) {
            sumOfElements = sumOfElements + array[i];
        }
        System.out.println(sumOfElements);
    }

    // Сумма значений четных индексов
    public static void sumOfEvenInd (int[] array) {
        int sumOfEvenInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumOfEvenInd = sumOfEvenInd + array[i];
            }

        }
        System.out.println(sumOfEvenInd);
    }

    public static void sumOfOddInd (int[] array) {
        int sumOfOddInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sumOfOddInd = sumOfOddInd + array[i];
            }
        }
        System.out.println(sumOfOddInd);
    }

    // Здесь я невнимательно прочла задание. Думала, нужно вернуть массив сумм крайних элементов)).
    public static int[] sumOfFirstAndLast (int[] array) {
        int[] arrayRes = new int[array.length / 2];
        for (int i = 0; i < array.length/2; i++) {
            for (int j = array.length-1; j > array.length/2-1; j--) {
                arrayRes[i] = array[i]+array[j];
                i++;
            }

        } return arrayRes;

    }

    public static int getSum(int[] arr) {
        int sum = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (start == end) {
                sum = sum + arr[start];
                break;
            }
            //[1 2 3 4 5 6 7]
            sum = sum + (arr[start] + arr[end]);
            start++;
            end--;
        }
        return sum;
    }





    public static void printArray (int[] array) {
        sumOfFirstAndLast(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }





}
