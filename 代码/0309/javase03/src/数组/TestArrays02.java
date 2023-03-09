package 数组;

import java.util.Arrays;

public class TestArrays02 {

    public static void main(String[] args) {

        //
        int[] arr1=null;
       // System.out.println(arr1.length);//NullPointerException
        //当一个对象为null的时候，对他的属性或者方法的调用会报空指针异常

        int[] arr2=new int[4];
        //System.out.println(arr2[4]);//arr[4]表示的第5个元素，会报数组下标越界异常

        //基本数据类型： byte　short int long float double char boolean
        //默认值  0           0     0   0  0. 0   0.0  ''  false

        //String类型默认初始值为null
        System.out.println(arr2[2]);//0

        float[]  arr3=new float[4];
        System.out.println(arr3[1]);//0.0

        //double默认值也是0.0
        char[] arr4=new char[9];
        System.out.println(arr4[2]+"||");// ''

        boolean[] arr5=new boolean[5];
        System.out.println(arr5[4]);

        String[] arr6=new String[4];
        System.out.println(arr6[3]);

        

    }
}
