package Feb1;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random random = new Random();
        int s = random.nextInt();
    }

    public static int[] getArray (int arrayLenght) {
        int[] arr = new int[arrayLenght];
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            arr[i] = random.nextInt(33);
        } return arr;
    }


}
