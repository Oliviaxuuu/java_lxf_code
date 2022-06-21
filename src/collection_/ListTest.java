package collection_;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        @SuppressWarnings({"all"})
        // ArrayList
        ArrayList<String> array = new ArrayList<String>() ;

        array.add("hello");
        array.add("world");
        array.add("java");

        // 遍历
        System.out.println("=======遍历======");
        for(String s : array) {
            System.out.println(s);
        }

        // iterator
        System.out.println("======迭代器==========");
        Iterator iterator = array.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        // for
        System.out.println("====for=======");
        for(int i = 0; i < array.size(); i ++) {
            Object obj1 = array.get(i);
            System.out.println(obj1);
        }

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("tomorrow");
        linkedList.add("will");
        linkedList.add("better");

        // 遍历
        System.out.println("=======遍历======");
        for(String s1 : linkedList) {
            System.out.println(s1);
        }

        // iterator
        System.out.println("======迭代器==========");
        Iterator iterator1 = linkedList.iterator();
        while(iterator1.hasNext()) {
            Object obj2 = iterator1.next();
            System.out.println(obj2);
        }

        // for
        System.out.println("====for=======");
        for(int j = 0; j < linkedList.size(); j++) {
            Object obj3 = array.get(j);
            System.out.println(obj3);
        }

    }
}
