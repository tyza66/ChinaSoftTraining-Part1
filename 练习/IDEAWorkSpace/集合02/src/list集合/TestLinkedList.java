package list集合;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        //底层是基于双向链表实现的数据结构 有很多的队列表头部和尾部的操作方法
        LinkedList<Integer> lst = new LinkedList<>();
        //添加元素
        for (int i = 1; i <= 11; i++) {
            lst.add(i);
        }
        System.out.println(lst);
        //往链表头部添加元素
        lst.addFirst(0);
        //往列表尾部添加元素
        lst.addLast(11);
        System.out.println(lst);
        //返回列表中的第一个元素
        System.out.println("头部元素是:" + lst.getFirst());
        //返回列表中的尾部元素
        System.out.println("尾部元素是:" + lst.getLast());
        //添加元素
        lst.offerFirst(-1);
        //往列表尾部添加元素
        lst.offerLast(12);
        System.out.println("添加后：" + lst);
        //获取并移除第一个元素
        System.out.println("拉出头部元素：" + lst.pollFirst());
        //获取并移除最后一个元素
        System.out.println("拉出尾部元素：" + lst.pollLast());
        System.out.println(lst);
        //获取并不删除头部元素
        System.out.println("获取并不移除头部元素：" + lst.peekFirst());
        //获取并不移除尾部元素
        System.out.println("获取并不移除尾部元素：" + lst.peekLast());
        //从列表中弹出一个元素
        System.out.println("弹出一个元素：" + lst.pop());
        System.out.println("再弹出一个元素：" + lst.pop());
        System.out.println();
        //往列表中推入一个元素
        lst.push(1);
        System.out.println(lst);

        lst.push(0);
        System.out.println(lst);
        //集合循环遍历
        for (int i = 0; i < lst.size(); i++) {
            Integer ele = lst.get(i);
            System.out.print(ele + " ");
        }
        System.out.println();

        for (Integer ele : lst) {
            System.out.print(ele + " ");
        }
        Iterator<Integer> it = lst.iterator();
        while(it.hasNext()){
            Integer ele = it.next();
            System.out.print(ele + " ");
        }
    }
}
