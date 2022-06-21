package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Collection_ {

    // 抑制警告错误
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        // 1. 集合主要是两组（单列集合，双列集合）
        // 2. Collection 接口有两个重要的子接口 List Set， 它们的实现子类都是单列集合
        // 3. Map 接口的实现子类 是双列集合，存放的K-V

        // Collection
        // Map

        ArrayList arrayList = new ArrayList();
        arrayList.add("limng");
        arrayList.add("xiaohong");

        HashMap hashMap = new HashMap();
        hashMap.put("NO1", "BEIJING");
        hashMap.put("NO2", "SHANGHAI");

    }
}
