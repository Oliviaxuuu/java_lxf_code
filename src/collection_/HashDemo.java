package collection_;

public class HashDemo {
    public static void main(String[] args) {


        Student s1 = new Student("xhaia", 23);
        System.out.println(s1.hashCode());

        Student s2 = new Student("wwe", 20);
        System.out.println(s2.hashCode());
    }
}
