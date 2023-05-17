package TryAndCatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class task {
    public static void main(String[] args) {

        char a = '1';
        System.out.println((int)a);

    }

    public static String example3(){
        String result = "";
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            return br.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }

        return result;
    }

    public static String example0() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        try {
            return br.readLine();
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }

    public static String example2() throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            return br.readLine();
        }
    }

    public static void classicWay() {
        // try-catch-finally blocks
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("test.txt"));
            System.out.println(bufferedReader.readLine());

            fileWriter = new FileWriter("test2.txt");

        } catch (IOException e) {
            System.out.println("Error #1047 " + e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }

            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

    }

    public static void modernWay() {

        //try-with-resources way
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
                FileWriter fileWriter = new FileWriter("test112.txt")
        ) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println(e);
        }

    }


}
