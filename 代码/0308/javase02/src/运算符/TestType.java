package 运算符;

public class TestType {
    public static void main(String[] args) {

        /*
        数据类型：
        基本数据类型： byte short int long float double  类型表示范围从小到大依次递增    char boolean
        引用数据类型：
         */

        //大类型 小类型 类型之间可以互相转化，小类型转换成大类型叫自动类型转换，向上转型；

        //低于int类型之间的数据运算自动以int类型为准;高于int类型的数据运算以大类型为准
        byte b1=12,b2=23;
       // byte b3=b1+b2;//不能使用byte,short类型接受
        int b3=b1+b2;
        short s1=23,s2=34;
        //short s3=s1+s2;//报错，不能使用short类型
        int s3=s1+s2;

        int i=23;
        long l=234;
        //int k=i+l;//不能使用int类型
        long k=i+l;

        float f=23.34f;
        // float=int+float
        float m=i+f;

        //大类型转换成小类型叫 强制类型转换   向下转型 有可能会造成精度损失

        float f1=23.12f;
        int i1= (int) f1;
        System.out.println(i1);//23

    }
}
