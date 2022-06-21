package collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Student("xiaoming", 20));
        list.add(new Student("xiaohong", 21));
        list.add(new Student("xiaolan", 23));
        // iterator
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        // for
        System.out.println("=====for======");
        for(Object students : list) {
            System.out.println("student = " + students);
        }

        // for循环
        System.out.println("=====for循环=====");
        for(int i = 0; i < list.size(); i ++) {
            Object obj = list.get(i);
            System.out.println("student = " + obj);

        }
    }
}
