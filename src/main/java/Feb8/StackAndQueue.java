package Feb8;

import java.util.LinkedList;
import java.util.Queue;

public class StackAndQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("!!!!");
        queue.add("77777");
        queue.add(")))))");
        queue.add("!");
        queue.add("&&&");
        queue.add("^");

        //ограничение очереди
        queue.offer("PPPP");

        System.out.println(queue);

        System.out.println(queue.remove()); // возвращает и удаляет первый элемент




    }
}
