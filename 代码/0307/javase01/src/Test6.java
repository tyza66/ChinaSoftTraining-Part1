public class Test6 {

    public static void main(String[] args) {

        int i=23;
        int j=5;

        i=18;//重新赋值
       // int j=6;//重复定义 非法的，会报错

        System.out.println(i);

        /*int m=23;
        int n=12;*/
        //快速注释 选中 ctrl+shift+/

        int m=23,n=12;//可以一次声明多个变量

        String s1="aaa",s2,s3="123";
        //System.out.println(s2);//变量未赋初始值不能被输出
        s2="zzz";
        System.out.println(s1+" "+s2+" "+s3);

        // 选中要注释的内容 ctrl+/ 快速单行注释
//        变量的声明可以直接声明变量；也可以先定义再复赋值
    }
}
