package com.icss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
//        使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示下述（图片）课程安排
        Map<String,String> map = new HashMap<>();
        map.put("Tom","CoreJava");
        map.put("Jhon","Oracle");
        map.put("Susan","Oracle");
        map.put("Jerry","JDBC");
        map.put("Jim","Unix");
        map.put("Kevin","JSP");
        map.put("Lucy","JSP");

//        ② 将教师Lucy，教授课程更改为CoreJava。
        map.replace("Lucy","CoreJava");
//        map.put("Lucy","CoreJava");

//        ③ 遍历Map，输出所有的老师及老师教授的课程。
//        方式一 map.keySet();
        Set<String> keys = map.keySet();
        /*for (String key : keys) {
            System.out.println("老师名称 " + key + " 老师教授的课程 " + map.get(key));
        }*/

       /* Iterator<String> its = keys.iterator();
        while(its.hasNext()){
            String key = its.next();
            System.out.println("老师名称 " + key + " 老师教授的课程 " + map.get(key));
        }*/

//     方式二 map.entrySet()
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("老师名称 " + entry.getKey() + " 老师教授课程 " + entry.getValue());
        }
        System.out.println("---------------------------------");
//        ④ 利用Map，输出所有教授课程为JSP的老师。
        for (Map.Entry<String, String> entry : entries) {
           if ("JSP".equals(entry.getValue())) {
               System.out.println("教授课程为JSP的老师 " + entry.getKey());
           }
        }


    }
}
