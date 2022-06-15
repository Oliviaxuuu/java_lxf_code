package inherited_;

public class testSuper {
    public static void main(String[] args) {
        S ss = new S("XIAOMIG", 12, 89);
    }
}

class P  {
    protected String name;
    protected int age;

    public P(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class S extends P {
    protected int score;

    public S(String name, int age, int score) {
        // 任何class的构造方法，第一行必须是调用superclass的构造方法。
        // 由于superclass没有super()，所以调用super(name, age)
        // subclass不会继承任何superclass的构造方法。subclass默认的构造方法是编译器自动生成的，不是继承的。
        super(name, age);
        this.score = score;
    }
}
