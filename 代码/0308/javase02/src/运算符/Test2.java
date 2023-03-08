package 运算符;

public class Test2 {
    public static void main(String[] args) {

        //逻辑运算符 &&  与 两边条件必须同时满足  ||或  两边只需要满足一边即可  ！非 对原值取反


        int i=13,j=17;
        boolean bl1=i<=j;//true
        boolean bl2=i>j;//false
        //&&  与 两边条件必须同时满足 两边结果必须同时为true。结果为true; 如果左边为false，结果是false.不计算右边
        System.out.println(bl1&&bl1);// true&& true=true
        System.out.println(bl1&&bl2);// true&& false=false
        System.out.println(bl2&&bl2);// false&& false=false

        //   ||或  两边只需要满足一边即可  两边有一边为true，结果为true; 如果左边为true，结果为true,不计算右边

        System.out.println(bl1||bl1);// true|| true=true
        System.out.println(bl1||bl2);// true|| false=true
        System.out.println(bl2||bl2);// false|| false=false

        //！非 对原值取反
        System.out.println(!bl1);// !true=false
        System.out.println(!bl2);// !false=true



    }
}
