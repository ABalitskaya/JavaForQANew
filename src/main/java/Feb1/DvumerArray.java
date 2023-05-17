package Feb1;

import java.util.Random;

public class DvumerArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int[][] b = {{1,2,3},
                {4,5,6,7},
                {8,9},
                {11,2,3,5,8,9,6,54,44,52}};

        for (int i = 0; i < b.length; i++) {
            System.out.println();
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);

            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[j].length; j++) {
                array[i][j] = new Random().nextInt(55);
            }

        }
    }
}
