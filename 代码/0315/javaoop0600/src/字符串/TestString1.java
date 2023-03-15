package 字符串;

public class TestString1 {

    public static void main(String[] args) {

        String str1="hjdhj";
        String str2=new String("fduhfhu");

        //char charAt(int index) 获取指定索引出的字符 索引是从0开始的
        char ch = str1.charAt(3);
        System.out.println("第三个字符是："+ch);


        //String concat(String str) 拼接字符串
        String str3 = str1.concat("hello");
        System.out.println("拼接之后的字符串为："+str3);

        // 用+拼接更方便
        String str4=str2+"world";
        System.out.println("拼接之后的字符串为："+str4);

        //boolean contains(String s) 判断是否包含指定的字串
        String str5="abcdessshello";
        boolean flag = str5.contains("aaa");
        System.out.println("字符串包含aaa?"+flag);

        boolean flag2 = str5.contains("sss");
        System.out.println("字符串包含sss?"+flag2);

        //static String copyValueOf(char[] data)   将char类型的数组转换成String类型
        char[] arr1=new char[]{'a','b','c','d','e'};
        String str6 = String.copyValueOf(arr1);
        System.out.println("数组转换之后的字符串是："+str6);

        //static String copyValueOf(char[] data, int offset, int count)
        // 第二个参数从第几个索引出开始找 第三个 就是找几个
        String str7 = String.copyValueOf(arr1, 1, 3);
        System.out.println("转换之后的字符串是："+str7);

        //boolean endsWith(String suffix)  判断是否以指定的后缀结尾
        String str8="Student.java";
        boolean flag3 = str8.endsWith(".java");
        System.out.println("java文件？"+flag3);

        //boolean equals(Object anObject)   比较两个对象是否相等
        String str9=new String("HJDHJ");
        boolean flag4 = str1.equals(str9);
        System.out.println("比较："+flag4);

        //boolean equalsIgnoreCase(String anotherString)   忽略大小写比较
        boolean flag5 = str1.equalsIgnoreCase(str9);
        System.out.println("比较："+flag5);//true
    }
}
