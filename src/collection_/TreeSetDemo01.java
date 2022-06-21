package collection_;

import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("hello");
        treeSet.add("java");
        treeSet.add("world");
        treeSet.add("java");

        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
