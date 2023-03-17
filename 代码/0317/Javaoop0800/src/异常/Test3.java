package 异常;

public class Test3 {

    public static void main(String[] args) {

        /*
        异常的处理机制：
        try{
            异常代码
        }catch(异常类型 变量){
            异常的处理
        }

        要求： 异常代码必须符合异常类型，就相当于  症状 必须 符合 该种病，要对症下药
        Exception是所有异常的父类，可以代表所有的异常
         */

        try {
            String s = null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("处理空指针异常");
        }
        System.out.println(1);

        try {
            int m = 10, n = 0;
            System.out.println(m / n);
        }catch(ArithmeticException e){
            System.out.println("分母不能为0");
        }
        System.out.println(2);

        try {
            int[] arr = new int[3];
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界了");
        }

        System.out.println(3);

        try {
            String str2 = "abcde";
            char ch = str2.charAt(6);
            System.out.println(ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("字符串下标越界了");
        }

        System.out.println(4);
    }
}
