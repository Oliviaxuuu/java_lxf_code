package collection_;

import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>();

        treeSet.add(new Student("li", 20));
        treeSet.add(new Student("xu", 25));
        treeSet.add(new Student("ke", 23));
        treeSet.add(new Student("ry", 24));
        treeSet.add(new Student("yh", 23));
        treeSet.add(new Student("yh", 23));

        for (Student student : treeSet) {
            System.out.println(student);
        }
    }
}
