package 数组;

public class TestArrays04 {

    public static void main(String[] args) {

        //二维数组： 数组里面的每个元素是个一维数组
        //定义 必须要指明数组的长度 new int[m][n] m表示二维数组的长度 n表示二维数组里面每个一维数组的长度  n可以不写
        int[][] arr=new int[3][];
        //给二维数组赋值
        arr[0]=new int[]{12,23};
        arr[1]=new int[]{34,27,67};
        arr[2]=new int[]{78,90};

        //重新赋值   78改成87 arr[i][j] i表示二维数组的索引  j表示二维数组里面的一维数组的索引
        arr[2][0]=87;

        //循环遍历二维数组
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }

        System.out.println();

        //forEach增强型for循环
        for(int[] arryi:arr){
            for(int ele: arryi){
                System.out.print(ele+"  ");
            }
        }

    }
}
