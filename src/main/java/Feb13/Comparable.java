package Feb13;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Misha");
        list.add("Kristina");
        list.add("Pavel");
        list.add("Elena");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        System.out.println(4==4);
    }
}
