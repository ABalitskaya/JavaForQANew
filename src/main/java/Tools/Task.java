package Tools;

import java.util.*;

public class Task {
    public static void main(String[] args) {

    }

    //1. Напишите метод, который принимает на вход список строк и возвращает количество уникальных строк в списке.
    public int Task1 (List<String> strings) {
        Set<String> uniqueStrings = new HashSet<>();
        uniqueStrings.addAll(strings);
        return uniqueStrings.size();
    }

    //2. Напишите метод, который принимает на вход список целых
    // чисел и возвращает наиболее часто встречающееся число в списке.

    public Integer Task2(List<Integer> integers) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxCount = 0;
        int maxNumber = 0;

        for (int i = 0; i < integers.size(); i++) {
            int number = integers.get(i);
            if (map.containsKey(number)) {
                int count = map.get(number) + 1;
                map.put(number, count);
                if (count > maxCount) {
                    maxCount = count;
                    maxNumber = number;
                }
            } else {
                map.put(number, 1);
            }
        } return maxNumber;
    }

    public static int findMostFrequent(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int mostFrequent = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequent;
    }

    public static int findMostFrequent1(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    //3. Напишите метод, который принимает на вход список строк и возвращает
    // новый список строк, в котором удалены все повторяющиеся элементы.

    public List<String> Task3 (List<String> strings) {
        Set<String> uniqueStrings= new HashSet<>();
        uniqueStrings.addAll(strings);
        strings.clear();
        strings.addAll(uniqueStrings);
        return strings;
    }

    public static List<String> removeDuplicates(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    //4.Напишите метод, который принимает на вход список объектов и возвращает новый
    // список объектов, отсортированный в порядке возрастания значений поля "value".
    public class MyObject implements Comparable<MyObject> {
        private int value;

        public MyObject(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        @Override
        public int compareTo(MyObject o) {
            return Integer.compare(this.value, o.value);
        }

        public static List<Object> sortByValue(List<Object> list) {
            list.sort((o1, o2) -> {
                MyObject value1 = ((MyObject) o1);
                MyObject value2 = ((MyObject) o2);
                return value1.compareTo(value2);
            });
            return list;
        }
    }

    //5.Напишите метод, который принимает на вход список строк и возвращает
    // новый список строк, отсортированный в порядке убывания длины строк.

    public static List<String> sortByLengthDescending(List<String> list) {
        String[] arr = new String[list.size()];
        arr = list.toArray(arr);
        Arrays.sort(arr, Comparator.comparingInt(String::length).reversed()); //через :: заказываем адрес объекта
        return Arrays.asList(arr);
    }

    //6.Напишите метод, который принимает на вход список целых чисел и возвращает новый список, содержащий только
    // нечетные числа из исходного списка, отсортированные в порядке возрастания.

    public List<Integer> task6 (List<Integer> integers) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : integers) {
            if (value % 2 != 0) {
                result.add(value);
            }
        }
        Collections.sort(result);
        return result;

    }

    // 7. Напишите метод, который принимает на вход список строк и возвращает новый
    // список строк, содержащий только те строки, которые начинаются на букву "A" или "a".

    public List<String> task7 (List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.startsWith("A") || str.startsWith("a")) {
                result.add(str);
            }
        }
        return result;
    }

    //8.Напишите метод, который принимает на вход два списка целых чисел и возвращает новый
    // список, содержащий только те числа, которые есть и в первом списке, и во втором списке.

    public List<Integer> task8 (List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : list1) {
            if (list2.contains(value)) {
                result.add(value);
            }
        } return result;
    }

    public static List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
        return new ArrayList<>(new HashSet<>(list1){{ addAll(list2); }});
    }

    //9. Напишите метод, который принимает на вход список строк и возвращает новый список строк, в котором
    // каждая строка повторяется столько раз, сколько символов в ней содержится.
    // не уверена
    public List<String> task9(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            for (int i = 0; i < str.length(); i++) {
                result.add(str);
            }
        }
        return result;
    }
    public static List<String> repeatByLength(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            int length = str.length();
            result.add(str.repeat(length));
        }
        return result;
    }

    //10.Напишите метод, который принимает на вход список строк и возвращает новый
    // список строк, в котором каждая строка записана задом наперед.

    public List<String> task10 (List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String st : strings) {
            StringBuilder sb = new StringBuilder(st);
            sb.reverse();
            result.add(sb.toString());
        }
        return result;

    }
    public static List<String> reverseStrings(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            StringBuilder sb = new StringBuilder(str);
            result.add(sb.reverse().toString());
        }
        return result;
    }
}
