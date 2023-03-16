package 字符串;

public class TestStringBuffer {
    public static void main(String[] args) {
        //StringBuffer是可变长的字符串 String 是固定长度的字符串
        //将String类型转换成StringBuffer类型
        String str="helloworld";
        StringBuffer str2 = new StringBuffer(str);
        System.out.println(str2);

        //StringBuffer append(Object obj)   追加指定的内容
        str2.append(false);
        char[] arr={'l','o','v','e'};
        str2.append(arr).append(3.5f);//可以连调
        System.out.println(str2);

        //char charAt(int index)  获取指定索引处的字符
        //获取最后一个字符
        char ch = str2.charAt(str2.length() - 1);
        System.out.println("最后一个字符是： "+ch);

        //int indexOf(String str)
        int index = str2.indexOf("world");//获取指定字符串出现位置的索引
        System.out.println("world在字符串中的索引是："+index);

        //StringBuffer insert(int offset, Object obj)   将指定对象插入到指定的位置
        str2.insert(5,"aaa");
        System.out.println("插入之后的字符串是："+str2);

        //StringBuffer reverse()   反转输出
        str2.reverse();
        System.out.println("反转输出之后："+str2);

        //void setCharAt(int index, char ch)  修改指定索引处的字符
        str2.setCharAt(1,'A');
        System.out.println("修改之后："+str2);

        //String toString()   将StringBuffer类型转换成String类型
        String str3 = str2.toString();
        System.out.println("字符串类型："+str3);
    }
}
