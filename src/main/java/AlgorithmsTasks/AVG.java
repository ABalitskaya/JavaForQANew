package AlgorithmsTasks;

import java.util.Arrays;

public class AVG {
    public static void main(String[] args) {
        int[] salaries1 = {900, 5000, 453, 20000, 3800, 0, 7650, 4800 };
        int[] salaries2 = {900, 5000};
        //System.out.println("Average Salary: " + averageSalary(salaries1));
        //System.out.println("Average Salary: " + average(salaries1));
        //System.out.println("Average Salary: " + averageSalary(salaries2));
        //System.out.println("Average Salary: " + average(salaries2));

        AVG avg = new AVG();
        if (avg.checkAverage_ArrayIsEmpty()) System.out.println("Тест пройден");
        else System.out.println("Тест не пройден");

    }

    /*
    * You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.*/

    public static double averageSalary(int[] salaries) {
        Arrays.sort(salaries);
        double sum = 0;
        if (salaries.length > 2) {
            for (int i = 1; i < salaries.length - 1; i++) {
                sum += salaries[i];
            }
            return sum / salaries.length - 2;
        } else return -1;

    }

    public static Double average(int[] salary) {


        if (salary.length > 2) {
            int min = Math.min(salary[0], salary[1]);
            int max = Math.max(salary[0], salary[1]);
            int sum = 0;

            for(int i = 2; i < salary.length; i++) {
                if(salary[i] < min) {
                    sum += min;
                    min = salary[i];
                } else if(salary[i] > max) {
                    sum += max;
                    max = salary[i];
                } else {
                    sum += salary[i];
                }
            }
            return (double) sum / (salary.length - 2);
        } else return null;
    }


        private Boolean checkAverage_ArrayIsEmpty(){
            return this.average(new int[]{}) == null;
        }

    private Boolean checkAverage_ArrayHas2OrLessElements(){
        return this.average(new int[]{}) == null;
    }
    }

