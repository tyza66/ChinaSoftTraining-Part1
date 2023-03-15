package 字符串;

public class TestString02 {
    public static void main(String[] args) {
        String str1="helloworld";
        //int indexOf(int ch)   获取指定字符第一次出现位置的索引
        int index1 = str1.indexOf('l');
        System.out.println("第一次出现位置的索引是："+index1);//2

        //int indexOf(int ch, int fromIndex)   从某个索引出开始找某个字符出现位置的索引
        int index2 = str1.indexOf('l', index1 + 1);//l第2次出现位置的索引
        System.out.println("第2次出现位置的索引是："+index2);//3

        //int indexOf(String str)  获取某个字符串第一次出现位置的索引
        int index3=str1.indexOf("llo");//2
        System.out.println("索引是："+index3);

        String str2="";
        //boolean isEmpty() 判断字符串是否为空
        boolean flag1 = str2.isEmpty();
        System.out.println("str2为空？"+flag1);//true

        //int lastIndexOf(String str)   从后往前找某个字符串出现位置的索引
        int index4 = str1.lastIndexOf("wor");
        System.out.println("索引是： "+index4);//5

        //int length()  返回字符串的长度
        int len=str1.length();
        System.out.println("长度是： "+len);//10

        //String replace(char oldChar, char newChar) 替换指定的字符
        String str3="aaa#bbb#ccc";
        String str4 = str3.replace('#', '?');
        System.out.println("替换之后的字符串是："+str4);

        //String replaceAll(String regex, String replacement)   替换指定的字符串
        String  str5="aahjhjaakkjaakl";
        String str6 = str5.replaceAll("aa", "AA");
        System.out.println("替换之后的字符串是： "+str6);

        //String replaceFirst(String ste,String str) 只替换第一组
        String str7 = str5.replaceFirst("aa", "XX");
        System.out.println("替换之后的字符串是： "+str7);


    }
}
