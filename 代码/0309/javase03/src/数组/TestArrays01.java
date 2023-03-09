package 数组;

import java.util.Arrays;

public class TestArrays01 {
    public static void main(String[] args) {

        //数组是具有固定长度的变量，里面存储的是同种类型的多个数据
        //数组声明的时候必须要指明长度  3表示的是长度
        int[] arr=new int[3];
        //arr[0] 表示第一个元素 0就是下标的意思，下标从0开始
        //给数组元素赋值
        arr[0]=23;
        arr[1]=36;
        arr[2]=90;

        //重新赋值
        arr[1]=63;

        System.out.println(arr);//直接输出数组 输出的是内存地址
        System.out.println("第2个元素是："+arr[1]);
        System.out.println("最后一个元素是："+arr[arr.length-1]);

       // arr[3]=200;//ArrayIndexOutOfBoundsException  会报数组下标越界异常  超出数组的最大表示范围了
        int length=arr.length;
        System.out.println("数组的长度 是："+length);

        //数组的循环遍历
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //foreach循环 增强型for循环 只能从左到右依次输出
        // :前面的表示的是数组里面的每个元素； 后面的arr表示要循环遍历的数组或者集合对象
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        //数组定义方式1
        String[] arr1={"aaa","bbb","ccc"};
        //定义一个数组，并指明他的长度，后面再给数组元素赋值
        String[] arr2=new String[3];
        //数组定义方式3
        String[] arr3=new String[]{"aaa","bbb","ccc"};

        for (String str:arr3){
            System.out.print(str+" ");
        }




    }
}
