package FileReader;

import java.io.*;

public class FileWork implements Serializable {
        public static void read(String[] args) {
            File file = new File("example.txt");
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void write(String[] args) {
            File file = new File("example.txt");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Hello, World!");
                writer.newLine();
                writer.write("This is a sample text.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

