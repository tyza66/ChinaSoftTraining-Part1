package 数组;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test5 {

    public static void main(String[] args) {

        //常用的类库
       // java.lang.Math
        int i=-3;
        int abs = Math.abs(i);//求绝对值
        System.out.println(abs);

        double random = Math.random();//求随机数 生产0-1之间的随机数
        System.out.println("随机数是："+random);

        //生产1-10之间的随机数
        int num = (int) Math.ceil(Math.random() * 10);
        System.out.println(num);

        int max = Math.max(23, 10);
        System.out.println("最大值是："+max);

        double min = Math.min(23.45, 12.23);
        System.out.println("最小值是："+min);

        //java.util.Arrays
        int[] arr=new int[]{23,12,24,34,67,39,10};
        //查找数组中某个元素的索引
        int index = Arrays.binarySearch(arr, 39);
        System.out.println(index);//5  要查找元素的下标是5

        Arrays.sort(arr);//数组排序的方法 默认是升序排序

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        int[] newarr = Arrays.copyOf(arr, 5);//复制指定长度的新数组

        for(int ele:newarr){
            System.out.print(ele+" ");
        }

        System.out.println();
       //日期时间 java.util.Date
        //获取系统当前时间
        Date date=new Date();
        System.out.println(date);

        //将时间格式化显示
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String nowtime = sdf.format(date);
        System.out.println("当前时间是："+nowtime);

    }
}
