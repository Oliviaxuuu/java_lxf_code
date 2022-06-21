package collection_;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class CollectionMethod {
    public static void main(String[] args) {
        // add: 添加
        List list = new ArrayList();
        list.add("tom");
        list.add(10);
        list.add(true);
        System.out.println("list = " + list);

        // remove
        list.remove(true);
//        list.remove(0);
        System.out.println("list = " + list);

        // contains
        list.contains("tom");
        System.out.println(list.contains("tom")); // true
        System.out.println(list.contains("tomm")); //false

        // isEmpty
        System.out.println(list.isEmpty());

        // clear
        list.clear();
        System.out.println("list = " + list);

        // addAll
        ArrayList list2 = new ArrayList();
        list2.add("hello");
        list2.add("world");
        list.addAll(list2);
        System.out.println("list = " + list);

        // contansAll
        System.out.println(list.containsAll(list2));

        list.add("good");
        // removeAll
        list.removeAll(list2);
        System.out.println("list = " + list);



    }
}
