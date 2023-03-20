package List集合.TestArrayList;

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
        list.add(1,"aaa");
        System.out.println(list);
    }

}
