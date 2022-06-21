package collection_;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Student> hashSet = new HashSet<Student>();

        hashSet.add(new Student("ghj", 20));
        hashSet.add(new Student("vssd",23));
        hashSet.add(new Student("aaa", 21));
        hashSet.add(new Student("aaa", 21));

        // 想要不重复输出，需要重写equal() 和 hashCode() 方法
        for (Student stu : hashSet) {
            System.out.println(stu);
        }

    }
}
