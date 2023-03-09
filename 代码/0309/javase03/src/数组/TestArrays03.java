package 数组;

public class TestArrays03 {

    public static void main(String[] args) {

        /*给定一个数组 int[] arr={12,34,14,67,89,25,10,29};

        要求：

        1. 将数组里面的每个元素从左到右依次输出
        2. 将数组里面的每个元素从右到左依次输出
        3. 将数组里面的每个元素从左到右每隔一个依次输出
        4. 将数组里面的每个元素从右到左每隔一个依次输出
        5. 求最大值，最小值*/
        int[] arr={12,34,14,67,89,25,10,29};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //   2. 将数组里面的每个元素从右到左依次输出
        System.out.println();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //3. 将数组里面的每个元素从左到右每隔一个依次输出
        for(int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }

        //4. 将数组里面的每个元素从右到左每隔一个依次输出
        System.out.println();
        for(int i=arr.length-1;i>=0;i-=2){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //5. 求最大值，最小值
        int max=arr[0],min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }

            if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println("最大值："+max);

        System.out.println("最小值："+min);

        //获取数组中某个元素第一次出现的位置  下标
        for(int i=0;i<arr.length;i++){
            if(arr[i]==67){
                System.out.println("下标是："+i);
            }
        }

    }
}
