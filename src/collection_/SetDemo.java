package collection_;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        // set 不包含重复元素
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");

        System.out.println(set);
    }
}
