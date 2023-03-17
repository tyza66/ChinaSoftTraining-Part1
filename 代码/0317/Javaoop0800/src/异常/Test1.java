package 异常;

public class Test1 {

    public static void main(String[] args) {
        /*
        异常： java.lang.Exception  程序由于代码原因在编译器或者运行期出现的一些问题
        错误： java.lang.Error  死机，断电,程序崩溃，虚拟机故障
        异常会造成程序的中断执行
         */

        String s=null;
        //System.out.println(s.length());//java.lang.NullPointerException 空指针异常 如果一个对象为null，对他所有属性或方法的调用会报空指针异常

        System.out.println(1);

        int m=10,n=0;
        //数学异常 除数不能为0
        //System.out.println(m/n);//Exception in thread "main" java.lang.ArithmeticException: / by zero

        System.out.println(2);

        int[] arr=new int[3];
        //会报数组下标越界异常
        //System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException: 3
        System.out.println(3);

        String str2="abcde";
        //会报字符串下标越界异常
        char ch = str2.charAt(6);//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6
        System.out.println(ch);
        System.out.println(4);

    }
}
