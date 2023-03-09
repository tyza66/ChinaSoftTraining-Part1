package 数组;

public class TestString {
    public static void main(String[] args) {

        //String类型默认初始值==null,
        //对String类型做非空判断
        String str="";
        //字符串非空判断的写法
        if(str!=null&&!str.equals("")){
            System.out.println("该字符串不为空");
        }else{
            System.out.println("该字符串为空");
        }
    }
}
