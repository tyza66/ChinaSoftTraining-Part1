package List集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestArrayList02 {
    public static void main(String[] args) {
        //boolean addAll(Collection<? extends E> c) 添加另外一个集合元素

        ArrayList list=new ArrayList();

        list.add(12);
        list.add("hgghsh");
        list.add(56);

        ArrayList list2=new ArrayList();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list.addAll(list2);

        System.out.println("添加后："+list);
        //Iterator<E> iterator()  返回一个用来循环的迭代器
        Iterator it = list.iterator();
        while(it.hasNext()){//判断是否有下一个元素
            Object obj = it.next();//如果有下一个，直接取出来
            System.out.print(obj+" ");

        }
        //boolean removeAll(Collection<?> c)     删除一个集合元素
        boolean flag1 = list.removeAll(list2);
        System.out.println("删除一个集合元素："+flag1);//true
        System.out.println("删除后："+list);

        //protected void removeRange(int fromIndex, int toIndex)  删除指定索引区间的元素  访问不了

        //List<E> subList(int fromIndex, int toIndex)  截取两个索引中间的子集合
        list.addAll(list2);
        System.out.println(list);
        List list3 = list.subList(1, 6);//前闭后开 前面索引包含在内，后面没有包含
        System.out.println("截取之后："+list3);


        System.out.println("list:"+list);
        list3.remove(0);
        System.out.println("删除后："+list3);

        //将集合转变成数组 Object[] toArray()
        Object[] arr1 = list3.toArray();
        System.out.println(arr1);//内存地址 需要循环遍历
        for(Object obj:arr1){
            System.out.print(obj+" ");
        }
        System.out.println();
        //如何将每个元素转变成集合Arrays.asList()
        List list4 = Arrays.asList(12, 23, 45, 56, 67);
        System.out.println(list4);


    }
}
