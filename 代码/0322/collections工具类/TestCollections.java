package collections工具类;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestCollections {

    public static void main(String[] args) {
        //操纵集合的工具类，里面没有构造方法，但是所有方法都是静态方法

        LinkedList<Integer> list1=new LinkedList<>();


        //static <T> boolean addAll(Collection<? super T> c, T... elements)  添加一个集合对象
        list1.add(20);
        list1.add(67);
        //list1.addAll(list2);
        Collections.addAll(list1,23, 45, 12, 46, 13, 78, 27);

        System.out.println("添加之后："+list1);
        System.out.println("集合大小："+list1.size());

        //static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)  查找某个元素
        int i = Collections.binarySearch(list1, 23);
        System.out.println(i);

        //static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)  求最大值
        Integer max = Collections.max(list1);
        System.out.println("最大值是："+max);

        //static <T extends Object & Comparable<? super T>> T min(Collection<? extends T> coll)  求最小值
        Integer min = Collections.min(list1);
        System.out.println("最小值是："+min);

        //static <T> boolean replaceAll(List<T> list, T oldVal, T newVal)   替换指定的元素
        Collections.replaceAll(list1,13,31);
        System.out.println("替换之后："+list1);

        //static void reverse(List<?> list)   反转输出
        Collections.reverse(list1);
        System.out.println("反转之后："+list1);

        //static void rotate(List<?> list, int distance)  旋转指定列表
        Collections.rotate(list1,3);
        System.out.println("旋转之后："+list1);

        //static void shuffle(List<?> list)   随机打乱列表元素
        Collections.shuffle(list1);
        System.out.println("打乱之后："+list1);

        //static <T extends Comparable<? super T>> void sort(List<T> list)  升序排序
        Collections.sort(list1);
        System.out.println("排序之后："+list1);

        //static <T> void copy(List<? super T> dest, List<? extends T> src)   复制集合
        LinkedList<Integer> list2=new LinkedList<>();
        list2.add(100);

        Collections.copy(list1,list2);
        System.out.println("移动之后："+list1);


    }
}
