package Feb24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new LinkedHashMap<>(); // сохраняет порядок вставки
        map.put("Berlin", 3677472);
        map.put("Hamburg", 1906411);
        map.put("Munich", 1487708);

        map.put("Siegen", 101516);
        map.put("Gutersloh", 101158);
        map.put("Hildecheim", 100319);

        System.out.println(map);

        System.out.println(map.get("Berlin"));

        System.out.println(map.size());

        map.put("Berlin", 10);
        System.out.println(map);

        map.containsKey("Berlin");
        map.containsValue("Berlin");
        System.out.println(map.containsKey("Berlin"));


        Map<Integer, String> treemap = new TreeMap<>();

        treemap.put(3677472, "Berlin");
        treemap.put(1906411, "Hamburg");
        treemap.put(1487708, "Munich");

        treemap.put(101516, "Siegen");
        treemap.put(101158, "Gutersloh");
        treemap.put(100319, "Hildecheim");

        treemap.size();
        treemap.isEmpty();

    }



}
