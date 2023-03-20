package List集合.TestArrayList;

import sun.rmi.log.LogInputStream;

import javax.swing.*;
import java.util.ArrayList;

public class TestArrayList {
    //基于动态数组实现，有下标的概念
    //数组元素是有顺序的可以重复的
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //add() 添加元素 返回布尔类型 将指定的元素添加到列表末尾
        list.add(12);
        list.add(false);
        list.add(null);
        list.add(12);
        System.out.println(list);
        //在指定的位置插入指定的元素
        list.add(1, "aaa");
        System.out.println(list);
        //判断是否包含指定的元素
        boolean flag1 = list.contains("aaa");
        //根据索引获取某个元素
        String ele = (String) list.get(1);
        System.out.println("获取下标为2的元素是" + ele);
        //求集合大小
        int size = list.size();
        System.out.println("集合的大小是" + size);
        //修改指定所引处的值
        list.set(3, true);
        System.out.println("修改之后的值是" + list);
        //删除指定的元素
        list.remove(2);//根据索引来删除
        list.remove((Object) 2);
        System.out.println("删除后" + list);
        //查询所有
        for(int i;i<list.size();i+++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for(Object obj:list){
            System.out.println(obj+" ");
        }
        //因为集合的长度是不断变化的，直接用for循环删除是不行的
        //可以使用clear方法全部删除
        list.clear();
        System.out.println("全部删除之后"+list);
        //判断集合是否为空
        boolean flag2 = list.isEmpty();
        System.out.println("集合为空吗？"+flag2);
    }

}
