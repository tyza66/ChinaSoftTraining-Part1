package 字符串;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class TestString02 {

    public static void main(String[] args) {
        //String toLowerCase()   全部转换成小写
        String str1="avhvFYhjhGHGHmnjVGYU";
        String str2 = str1.toLowerCase();
        System.out.println("转换成小写后："+str2);

        //String toUpperCase()   全部转换成大写
        String str3 = str1.toUpperCase();
        System.out.println("转换成大写后："+str3);

        //String trim()   去除空格，只能去除前后空格，中间空格不能去除
        String str4="  djh df ";
        System.out.println("去空格前："+str4+"长度是："+str4.length());
        String str5 = str4.trim();
        System.out.println("去空格后："+str5+"长度是："+str5.length());

        //static String valueOf(boolean b)   将boolean类型转换成String类型
        String str6 = String.valueOf(false);
        System.out.println(str6);

        //static String valueOf(float f)   将float类型转换成String类型
        float f=45.34f;
        String str7 = String.valueOf(f)+10;
        System.out.println(str7);//+ 起拼接效果

        char ch1='a',ch2='y';
        //每个char类型的值都对应一个int类型的ascii码值 int类型是大类型，char类型是小类型
        int i1=ch1;//自动转换成int类型 int是大类型，会自动类型转换
        int i2=ch2;
        System.out.println(i1+" "+i2);
        System.out.println(ch1+ch2);
        System.out.println((char)(ch1+1));// b  int类型转换成char类型 强制类型转化


        //非空判断
        String s="";//"" null
        if(s!=null&&!"".equals(s)){
            System.out.println(s);
        }else{
            System.out.println("该变量为空");
        }

        //String replace(CharSequence target, CharSequence replacement)   也可以替换指定的字符串
        String str8="aahjhaajhjaakjaaj";
        String str9 = str8.replace("aa", "AA");
        System.out.println(str9);

    }
}
