package list集合;

import org.omg.CORBA.INTERNAL;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {

        //底层是基于双向链表的而数据结构 有很多对列表头部和尾部操作的方法
        LinkedList<Integer> lst = new LinkedList<>();
        //添加元素
        for (int i = 1; i < 11; i++) {
            lst.add(i);
        }
        System.out.println(lst);
        //void addFirst(E e)  往头部添加元素
        lst.addFirst(0);
        //void addLast(E e)  往列表尾部添加元素
        lst.addLast(11);
        System.out.println("添加元素后：" + lst);

        //E getFirst()  返回列表中的第一个元素
        System.out.println("头部元素：" + lst.getFirst());
        //F getLast()   返回列表中的尾部元素
        System.out.println("尾部元素：" + lst.getLast());


        //boolean offerFirst(E e)  添加头部元素
        lst.offerFirst(-1);
        //boolean offerLast(E e) 添加尾部元素
        lst.offerLast(12);
        System.out.println("添加后：" + lst);

        //pollFirst() 获取并移除第一个元素
        //pollLast()  获取并移除最后一个元素
        System.out.println("拉出头部元素：" + lst.pollFirst());
        System.out.println("拉出尾部元素：" + lst.pollLast());
        System.out.println(lst);

        //peekFirst() 获取并不移除头部元素
        //peekLast()  获取并不移除尾部元素
        System.out.println("获取并不移除头部元素：" + lst.peekFirst());
        System.out.println("获取并不移除尾部元素：" + lst.peekLast());
        System.out.println(lst);

        //E pop() 从列表中弹出一个元素
        System.out.println("弹出一个元素：" + lst.pop());
        System.out.println("再弹出一个元素：" + lst.pop());
        System.out.println(lst);

        //void push(E e)  推入一个元素
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
        System.out.println();
        Iterator<Integer> it = lst.iterator();
        while (it.hasNext()) {
            Integer ele = it.next();
            System.out.print(ele+" ");
        }

    }
}
