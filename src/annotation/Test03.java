package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 自定义注解
public class Test03 {
    // 注解可以显示赋值，如果没有默认值，我们必须给注解赋值
    @MyAnnotaton2(name = "Olivia", schools = {"UCLA", "NYU"})
    public void test() {
    }

    // @MyAnnotation3(name = "Olivia")
    @MyAnnotation3("Olivia")
    public void test2() {
    }

}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)

@interface MyAnnotaton2 {

    // 注解参数: 参数类型 + 参数名();
    String name() default "";
    int age() default 0;
    int id() default -1; // 如果默认值为-1，代表不存在

    String[] schools();
}

@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
    // String name();
    String value();
}