package list集合;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        //底层是基于双向链表实现的数据结构 有很多的队列表头部和尾部的操作方法
        LinkedList<Integer> lst = new LinkedList<>();
        //添加元素
        for (int i=1;i<=11;i++){
            lst.add(i);
        }
        System.out.println(lst);
        //往链表头部添加元素
        lst.addFirst(0);
        //往列表尾部添加元素
        lst.addLast(11);
        System.out.println(lst);
        //返回列表中的第一个元素
        System.out.println("头部元素是:"+lst.getFirst());
        //返回列表中的尾部元素
        System.out.println("尾部元素是:"+lst.getLast());
    }
}
