package 各种集合;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        //属于是List可以有重复
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(2);
        v.add(3);
        v.add(null);
        //获得挡前容量 v是可以有动态的容量的，默认的容量是10
        System.out.println(v.capacity());
        //v中的元素是根据进去的顺序的
        System.out.println(v.get(1));
        //获取里面全部东西的枚举 这个玩意的使用和迭代器很相似
        Enumeration<Integer> ele = v.elements();
        while(ele.hasMoreElements()){
            Integer i = ele.nextElement();
            System.out.print(i + " ");
        }
    }
}
