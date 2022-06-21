package collection_;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        linkedList.addFirst("come");
        System.out.println(linkedList);
        linkedList.addLast("on");
        System.out.println(linkedList);

        System.out.println("===========");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println("===========");
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }
}
