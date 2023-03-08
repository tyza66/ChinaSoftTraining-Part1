package 面对对象之前;

public class 数组作业 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 14, 67, 89, 25, 10, 29};
        //将数组里面的每个元素从左到右依次输出
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        //将数组里面的每个元素从右到左依次输出
        for (int i = arr.length; i >= 1; i--) {
            System.out.print(arr[i - 1] + " ");
        }
        System.out.println();
        //将数组里面的每个元素从左到右每隔一个依次输出
        for(int i=1;i<=arr.length;i++){
            if (i%2==1)
                System.out.print(arr[i - 1] + " ");
        }
        System.out.println();
        //将数组里面的每个元素从右到左每隔一个依次输出
        for(int i=1;i<=arr.length;i++){
            if (i%2==0)
                System.out.print(arr[i - 1] + " ");
        }
        System.out.println();
        //求最大值，最小值
        int max=arr[0],min=arr[0];
        for (int i : arr) {
            if(i<min)
                min = i;
            if (i>max)
                max = i;
        }
        System.out.println("最小："+min+",最大："+max);
    }
}
