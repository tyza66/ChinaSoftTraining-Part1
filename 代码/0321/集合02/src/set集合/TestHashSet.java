package set集合;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

    public static void main(String[] args) {

        //set集合没有下标这个概念，无序的，元素不重复
        //Collection 接口---》Set子接口-----> HashSet 实现类

        HashSet<Integer> set=new HashSet<>();
        //boolean add(E e)  添加元素
        set.add(12);
        set.add(56);
        set.add(23);
        set.add(null);
        set.add(0);
        set.add(null);
        set.add(12);
        set.add(45);
        //无序的，元素不重复
        System.out.println("set:"+set);
        int size=set.size();
        System.out.println("集合大小是："+size);

        //boolean remove(Object o)   删除某个元素对象
        set.remove(23);
        System.out.println("删除后："+set);

        //循环遍历
      /*  for(int i=0;i<set.size();i++){
            //set集合里面没有取值的方法，没有下标这个概念
        }*/

        for(Integer ele:set){
            System.out.print(ele+" ");
        }

        System.out.println();
        //迭代器来实现循环
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer next = it.next();
            System.out.print(next+" ");
        }

        System.out.println();

        for(Iterator<Integer> it1= set.iterator();it1.hasNext();){
            Integer next = it1.next();
            System.out.print(next+" ");
        }
    }
}
