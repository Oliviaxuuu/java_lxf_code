package annotation;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.annotation.*;

// 测试元注解
@Myannotation
public class Test02 {

    @Myannotation
    public void test() {

    }
}

// 定义一个注解
// Target可以表示注解用在哪些地方
// @Target(value = ElementType.METHOD)
@Target(value = {ElementType.METHOD, ElementType.TYPE})

// Retention表示注解在什么地方有效
// runtime > class > sources
@Retention(value = RetentionPolicy.RUNTIME)

// Documented 表示是否将注解生成在javadoc中
@Documented

// Inherited subclass可以继承superclass注解
@Inherited
@interface Myannotation {

}