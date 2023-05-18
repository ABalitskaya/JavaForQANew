package HappyNumber;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println("Введите любое число, а я скажу, счастливое оно или нет");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isHappy(n))
            System.out.println("Happy number! :))");
        else
            System.out.println("Not happy number :((");
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> setOfSums = new HashSet<>();
        setOfSums.add(n);
        
        while (true) {
            if (n == 1)
                return true;
            n = sumDigitSquare(n);
            if ((setOfSums.contains(n) && n != (int)setOfSums.toArray()[setOfSums.size()-1 ]))
                return false;
            setOfSums.add(n);
        }
    }

    static int sumDigitSquare(int n)
    {
        int square = 0;
        while (n > 0)
        {
            int digit = n % 10;
            square += digit * digit;
            n = n / 10;
        }
        return square;
    }

}