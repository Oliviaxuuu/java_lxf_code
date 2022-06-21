package collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        @SuppressWarnings({"all"})
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        // 1. 使用增强for循环 在Collection集合
        // 2. 增强for： 底层还是迭代器
        // 3. 增强for 可以理解成接话版本的迭代器遍历
        // 快捷键 I
        for(Object book : col) {
            System.out.println("book = " + book);
        }

        // 增强for也可以用在数组上
        int[] nums = {10, 20, 30, 40, 50};
        for(int n : nums) {
            System.out.println("nums = " + n);
        }
    }

}

