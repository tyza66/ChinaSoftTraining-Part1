package 异常;

public class Test2 {

    public static void main(String[] args) {
        //通过if判断来处理  通过经验来判断的
        String s=null;

        if(s!=null&&!"".equals(s)){
            System.out.println(s);
        }else{
            System.out.println("s为空了");
        }
        System.out.println(1);

        int m=10,n=0;
        if(n!=0){
            System.out.println(m/n);
        }else{
            System.out.println("除数不能为0");
        }
        System.out.println(2);

        int[] arr=new int[3];
        int index=3;
        if(index<arr.length){
            System.out.println(arr[index]);
        }else {
            System.out.println("数组下标越界了");
        }

        System.out.println(3);

        String str2="abcde";
        int i=6;
        if(i<str2.length()){
            char ch=str2.charAt(i);
            System.out.println(ch);
        }else{
            System.out.println("字符串下标越界了");
        }
        System.out.println(4);
    }
}
