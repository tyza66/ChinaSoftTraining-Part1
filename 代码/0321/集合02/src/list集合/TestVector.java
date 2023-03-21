package list集合;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        //允许null值，有顺序的，
        v.add(3);
        v.add(5);
        v.add(1);
        v.add(null);
        v.add(4);
        v.add(3);
        System.out.println("vector集合是："+v);
        System.out.println("vector集合大小是："+v.size());
        System.out.println("最后一个元素是："+v.get(v.size()-1));

        //int capacity()   返回他的当前容量 初始容量10
        int cap1=v.capacity();
        System.out.println("此时容量为："+cap1);

        for(int i=10;i<=20;i++){
            v.add(i);
        }
        System.out.println("添加之后："+v);
        int cap2=v.capacity();//容量动态扩充
        System.out.println("此时容量为："+cap2);

        //Enumeration<E> elements()  返回此向量的组件的枚举
        Enumeration<Integer> elements = v.elements();
        while(elements.hasMoreElements()){//判断是否有更多的元素
            //如果有，取出下一个元素
            Integer ele = elements.nextElement();
            System.out.print(ele+" ");
        }
        System.out.println();
        //E elementAt(int index)  获取指定索引出的元素
        Integer lastEle = v.elementAt(v.size() - 1);
        System.out.println("最后一个元素是："+lastEle);
    }
}
