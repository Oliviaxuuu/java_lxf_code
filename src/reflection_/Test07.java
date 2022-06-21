package reflection_;

public class Test07 {
    public static void main(String[] args) {
        // 获得系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
    }
}
