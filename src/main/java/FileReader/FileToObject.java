package FileReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
* Создать класс TestData который содержит в себе name и data
создать fromString и toString
создать метод записи и метод чтения из файла (принимают на вход номер файл если пришел 1 значит надо читать или записывать из data1.txt)
чтение принимает только номер и возвращает список из объектов вашего класса
запись принимает номер и  список объектов вашего класса и ничего не возвращает*/
public class FileToObject {
        public static void main(String[] args) {

            System.out.println(FileToObject.read(1));
            FileToObject.write(List.of(new TestData("ffff", "5fdg1")),  1);
            System.out.println(FileToObject.read(1));

            /*List<TestData> dates = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader("data1.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    TestData testData = TestData.fromString(line);
                    dates.add(testData);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (TestData testData : dates) {
                System.out.println(testData.getName() + " " + testData.getData());
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("data1.txt", true))) {
                for (TestData person : dates) {
                    writer.write(person.toString());
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } */
        }

        public static List<TestData> read (int fileNumber) {
            List<TestData> dates = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader("data" + fileNumber + ".txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    TestData testData = TestData.fromString(line);
                    dates.add(testData);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return dates;
        }

        public static void write (List<TestData> list, int fileNumber) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("data" + fileNumber + ".txt"))) {
                for (TestData testData : list) {
                    writer.write(testData.toString());
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

