/**
 * 文档注释
 */
public class Test4 {

    public static void main(String[] args) {
        //单行注释
        /*
            多行注释
            数据类型：
            基本数据类型：8种
                数值：
                    整数  byte short int long
                    小数  float double

                字符： char   使用单引号来表示

                判断： boolean  true/false

            引用数据类型：

                数组 String  类 接口
         */
        //整数： byte short int long
        byte b=127;
        short s=256;
        int i=647;
        long l=3444;

        //小数 float double
        float f=3.4f;//float类型后面必须加f
        double d=23.45;

        char ch='我';//使用单引号来表示
        boolean bl=false;//只有两个值 true/false
        String str="12345";

        System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+ch+" "+bl+" "+str);



    }
}
