package annotation;

import java.util.ArrayList;
import java.util.List;

public class Test01 extends Object{

    // @Override 重写的注解
    @Override
    public String toString() {
        return super.toString();
    }

    // Deprecated 不推荐使用，但是也可以使用或存在更好的方式
    @Deprecated
    public static void test() {
        System.out.println("Deprecated");
    }

    @SuppressWarnings("all")
    public void test02() {
        List list = new ArrayList();
    }

    public static void main(String[] args) {
        test();
    }
}
