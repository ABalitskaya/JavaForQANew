package Feb16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class JavaCollections {

    static Random random = new Random();
    static int n = 100_000_000;
    static List<Integer> list = new ArrayList<>(n);

    public static void main(String[] args) {
        // создание array list!
        List<String> stringList = new ArrayList<>();
        System.out.println(stringList.size());
        stringList.add("Masha");
        stringList.add("Sasha");
        stringList.add("Pasha");
        stringList.add("Dasha");
        stringList.add("Lasha");
        System.out.println(stringList);
        System.out.println(stringList.contains("me"));


        List<Integer> integers = new LinkedList<>();
        integers.add(1);
        System.out.println(integers.get(0));

    }


}
