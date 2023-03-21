package map集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        System.out.println("集合大小是："+map.size());
        System.out.println("集合是否为空？"+map.isEmpty());

        //添加元素
        //HashMap特点： 允许null的key和null的value;键不能重复；多个键可以对应一个值
        map.put("a","aaa");
        map.put("a","bbb");
        map.put("b","ddd");
        map.put(null,"eee");
        map.put("c","ddd");
        map.put("d",null);

        System.out.println("集合大小是："+map.size());
        System.out.println("map集合："+map);

        //V get(Object key)   根据键来取对应的值
        String value = map.get("c");
        System.out.println("value值是："+value);

        //查询所有元素
        //Set<Map.Entry<K,V>> entrySet()  返回一个键值对的集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String,String> entry:entries){//Map.Entry<String,String 表示一对键值对
            String key = entry.getKey();
            String val = entry.getValue();
            System.out.println("key="+key+" value="+val);
        }
        System.out.println("--------------------------");

        //Set<K> keySet()  获取所有键的集合
        Set<String> sets = map.keySet();
        for(String key:sets){
            String strValue = map.get(key);//根据键来获取对应的值
            System.out.println("key="+key+" value="+strValue);
        }
        System.out.println("-----------------------");
        //Collection<V> values()  获取所有值的集合
        Collection<String> values = map.values();
        for(String val:values){
            System.out.println("值是："+val);
        }

        //V remove(Object key)根据key来删除对应的键值对
        map.remove("d");
        System.out.println("删除后："+map);

        //boolean containsKey(Object key)  是否包含指定的key
        System.out.println("是否包含d?"+map.containsKey("d"));//false

        //boolean containsValue(Object value)  是否包含指定的value值
        System.out.println("是否包含指定的value?"+map.containsValue("bbb"));//true

        //V replace(K key, V value)   替换指定的key对应的键值对
        map.replace("c","AAAA");
        System.out.println("替换后："+map);

        //void clear()   全部删除 清空
        map.clear();

        System.out.println("清空之后："+map);
        System.out.println("清空之后集合大小："+map.size());

    }
}
