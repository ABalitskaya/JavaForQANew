package AlgorithmsTasks;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Преобразование римских цифр в арабские

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "VI";
        String romanNumeral1 = "IV";
        String romanNumeral2 = "VIII";
        String romanNumeral3 = "III";
        String romanNumeral4 = "LVIII";
        String romanNumeral5 = "DII";
        String romanNumeral6 = "MCMXCIV";
        String romanNumeral7 = "LVIII";

        System.out.println(romToInt(romanNumeral));
        System.out.println(romToInt(romanNumeral1));
        System.out.println(romToInt(romanNumeral2));
        System.out.println(romToInt(romanNumeral3));
        System.out.println(romToInt(romanNumeral4));
        System.out.println(romToInt(romanNumeral5));
        System.out.println(romToInt(romanNumeral6));
        System.out.println(romToInt(romanNumeral7));

        List<String> list = new LinkedList<>();
        list.add("Vasya");
        System.out.println(list.contains("Vasya")); // Вернет true
        if(list.contains("Vasya")) {
            System.out.println("Да, Вася действительно есть в этом списке ;)");
        }
    }

    public static int romToInt(String romanString) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int totalValue = 0;
        int previousValue = 0;

        for (int i = romanString.length()-1; i >=0 ; i--) {
            char symbol = romanString.charAt(i);
            int valueOfSymbol = romanMap.get(symbol);

            if(valueOfSymbol < previousValue) {
                totalValue -= valueOfSymbol;
            }
            else {
                totalValue +=valueOfSymbol;
            }
            // totalValue += valueOfSymbol >= previousValue ? valueOfSymbol : -valueOfSymbol;
            previousValue = valueOfSymbol;
        } return totalValue;
    }
}
