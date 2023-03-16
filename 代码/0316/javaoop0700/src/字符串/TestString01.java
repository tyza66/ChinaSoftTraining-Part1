package 字符串;

public class TestString01 {
    public static void main(String[] args) {

        //String[] split(String regex)   拆分指定字符串
        String str1="abc#bbb#ooo#lll";
        String[] arr1 = str1.split("#");
        for(String ele:arr1){
            System.out.print(ele+" ");
        }
        System.out.println();
        //boolean startsWith(String prefix)   判断是否以指定的前缀结尾
        boolean flag1 = str1.startsWith("abc");
        System.out.println("是否以abc开始？"+flag1);//true

        //CharSequence subSequence(int beginIndex, int endIndex)  返回2个索引中间的字符串
        CharSequence str2 = str1.subSequence(4, 7);
        System.out.println(str2);//bbb

        //String substring(int beginIndex)   从某个位置开始往后截取字符串
        String str3 = str1.substring(4);
        System.out.println("截取之后的字符串是： "+str3);

        //String substring(int beginIndex, int endIndex)  截取2个索引中间的字符串
        String str4 = str1.substring(4, 7);
        System.out.println("截取之后的字符串是："+str4);//bbb

        //char[] toCharArray()   将字符串转换成字符数组
        String str5="hello";
        char[] arr2 = str5.toCharArray();
        for (char ch:arr2){
            System.out.print(ch+" ");
        }
        System.out.println();

        //将char类型的数组转换成String类型
        //有参的构造方法
        String  str6=new String(arr2);
        System.out.println("转换后的String："+str6);

        //static String valueOf(char[] data)   将char类型数组转换成String 类型
        //静态方法通过类名打点调用
        String str7 = String.valueOf(arr2);
        System.out.println("转换后的String："+str7);


    }
}
