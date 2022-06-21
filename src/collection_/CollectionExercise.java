package collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("gougou", 10));
        list.add(new Dog("huahua", 5));

        // 迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }

        System.out.println("================");
        // 增强for
        for (Object obj1 : list) {
            System.out.println("obj1 = " + obj1);
        }
    }
}
 class Dog {
    private String name;
    private int age;

     public Dog(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     @Override
     public String toString() {
         return "Dog{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }
 }