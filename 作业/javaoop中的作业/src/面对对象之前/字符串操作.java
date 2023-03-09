package 面对对象之前;

public class 字符串操作 {
    public static void main(String[] args) {
        //经过运算，把里面的字符反转输出
        String str = "hgrh'[iyhwghl;hp'ghibjg";
        String[] ones = str.split("");
        String out = "";
        for (int i = ones.length; i >= 1; i--) {
            out += ones[i-1];
        }
        System.out.println(out);
        //编写一个程序,利用数组求出”HELLO”,”JAVA”，”PROGRAM”三个字符串的平均长度
        String[] arr={"HELLO","JAVA","PROGRAM"};
        System.out.println((arr[0].length()+arr[1].length()+arr[2].length())/3);
    }
}
