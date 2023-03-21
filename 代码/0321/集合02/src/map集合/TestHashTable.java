package map集合;

import java.util.*;

public class TestHashTable {
    public static void main(String[] args) {

        //HashTable 的键和值不允许有null值  键不可以重复，多个键可以对应同一个值
        Hashtable<String,String> map=new Hashtable<>();
        map.put("a","aaa");
        map.put("a","bbb");
        map.put("b","ddd");
       // map.put(null,"eee");
        map.put("c","ddd");
        //map.put("d",null);
        map.put("d","eee");

        System.out.println("map集合大小是："+map.size());
        System.out.println("map集合是："+map);

        //修改V replace(K key, V value)
        map.replace("a","AAA");
        System.out.println("修改之后："+map);

        //V remove(Object key)   根据键来删除指定的键值对
        map.remove("c");
        System.out.println("删除之后："+map);



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

        System.out.println("-----------------------");
        //Enumeration<V> elements()   获取所有值的枚举类型
        Enumeration<String> elements = map.elements();
        while(elements.hasMoreElements()){//判断是否有更多的而元素
            String ele = elements.nextElement();//如果有，直接取出下一个元素
            System.out.println("值是： "+ele);

        }

        //clone() 浅拷贝一个对象
        Hashtable<String,String> map2 = (Hashtable<String, String>) map.clone();
        System.out.println("拷贝之后："+map2);

    }
}
