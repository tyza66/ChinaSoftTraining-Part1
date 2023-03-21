package 各种集合;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("giao","giao1");
        System.out.println(m.get("giao"));
        //拿到所有key的set集合
        m.keySet();
        //拿到所有的value的结合
        m.values();
    }
}
