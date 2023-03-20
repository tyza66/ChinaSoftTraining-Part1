package List集合;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {
        /*
        Collection 子接口 List 和 Set
        List接口的实现类： ArrayList
        ArrayList特点： 基于动态数组的数组的实现，有下标这个概念 从0开始的
        放的是Object对象，表示任意类型
        数组元素是有序的，可以重复的
         */
        ArrayList list=new ArrayList();
        //boolean add(E e) 将指定的元素列表末尾
        list.add(12);
        list.add("abcde");
        list.add(false);
        list.add(45.67f);
        list.add('你');
        list.add(null);
        list.add(2);
        list.add(12);
        System.out.println(list);
        //void add(int index, E element)  在指定的位置插入指定的元素
        list.add(1,"AAA");
        System.out.println(list);//插入在第2个元素之前

        //boolean contains(Object o)  判断是否包含指定的元素
        boolean flag1 = list.contains("AAA");
        System.out.println("是否包含？"+flag1);//true

        //E get(int index) 根据索引来获取某个元素
        String ele = (String) list.get(2);
        System.out.println("下标为2的元素是："+ele);

        //int size()  求集合大小
        int size = list.size();
        System.out.println("集合大小是："+size);

        //E set(int index, E element)   修改指定索引出的元素
        list.set(3, true);
        System.out.println("修改之后："+list);

        /*
        E remove(int index)
        移除此列表中指定位置的元素。
        boolean remove(Object o)
        从该列表中移除指定元素的第一个发生，如果它是存在的。

         */
        list.remove(2);//根据索引来删
        System.out.println("删除后："+list);
        list.remove((Object) 2);//删除2这个对象
        System.out.println("删除后："+list);

        //全部查询所有
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();
        for (Object obj:list) {
            System.out.print(obj+" ");
        }
        //全部删除 这种方式不可以，因为集合长度是动态的，是不断变化的
        System.out.println();
       /* for(int i=0;i<list.size();i++){
            list.remove(i);
        }
        System.out.println("全部删除后："+list);*/

        //void clear()   清空，全部删除
        list.clear();
        System.out.println("全部删除之后："+list);


        //boolean isEmpty()   判断集合是否为空
        boolean flag3 = list.isEmpty();
        System.out.println("集合为空？"+flag3);//true
    }
}
