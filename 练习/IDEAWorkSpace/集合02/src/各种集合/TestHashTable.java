package 各种集合;

import java.util.Hashtable;
import java.util.Map;

public class TestHashTable {
    public static void main(String[] args) {
        Map<String,String> map =new Hashtable<>();
        map.put("a","aaa");
        map.put("b","ccc");
        //这个东西是线程同步的很安全
    }
}
