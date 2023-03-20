package List集合;



import java.util.Scanner;

public class TestBaoZhuang {
    public static void main(String[] args) {

        /*
        基本数据类型： byte  short int long float double char boolean
        包装类：      Byte   Short Integer Long Float Double Character Boolean
        包装类里面有一些现成的属性或方法可以直接调用；每个基本数据类型都有她对应的包装类
        基本数据类型可以和他的包装类之间互相转换
        基本数据类型可以自动转换成吧包装类叫自动装箱；反之叫 自动拆箱


         */
    /*    intToString();
        strToInt();*/
       /* System.out.println("请输入一个字符串：");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        stringToInt(s);*/
        //static int max(int a, int b)
        int max = Integer.max(23, 12);
        System.out.println("最大值是："+max);

        //static int min(int a, int b)
        int min = Integer.min(45, 23);
        System.out.println("最小值是："+min);

        //static int sum(int a, int b)
        int sum = Integer.sum(56, 12);
        System.out.println("和是："+sum);

        //float floatValue()  将int类型抓换成float类型
        Integer i=123;
        float f = i.floatValue();
        System.out.println("转换之后的float类型："+f);


    }

    public int aa(){
        Integer i=33;
        return i;
    }
    public Double bb(){
        double d=34.56;
        return d;
    }
    //String 类型和int类型之间的互相转换
    //int类型转换成String类型
    public static  void intToString(){
        int i=100;
        //static String toString(int i)
        String str = Integer.toString(100);
        System.out.println(str+10);//10010

    }
    //将String类型转换成int类型
    public static void strToInt(){
        String s="100";
        //static int parseInt(String s)
        //static Integer valueOf(String s)
        //int num = Integer.parseInt(s);
        Integer num = Integer.valueOf(s);
        System.out.println(num+10);//110
    }

    public static void stringToInt(String  s){
        try {
            System.out.println(Integer.parseInt(s));

        }catch (NumberFormatException e){
            System.out.println("输入不合法，请输入一个数值");
        }
    }
}
