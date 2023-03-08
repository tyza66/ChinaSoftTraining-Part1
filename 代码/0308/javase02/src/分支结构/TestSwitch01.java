package 分支结构;

public class TestSwitch01 {
    public static void main(String[] args) {

        //功能描述：使用 switch 语句实现迷你运算器，支持“+”、“-”、“*”、“/”，自己定义两个操作数，显示输出运算结果
        double n1=23.4;
        double n2=4;

        //		变量的类型： byte,short,char,int   String只在jdk7.0以上版本支持
        char ch='*';
        switch (ch){
            case '+':
                System.out.println(n1+"+"+n2+"="+(n1+n2)); break;
            case '-':
                System.out.println(n1+"-"+n2+"="+(n1-n2)); break;
            case '*':
                System.out.println(n1+"*"+n2+"="+(n1*n2)); break;
            case '/':
                System.out.println(n1+"/"+n2+"="+(n1/n2)); break;
            case '%':
                System.out.println(n1+"%"+n2+"="+(n1%n2)); break;

            default:
                System.out.println("该操作不合法");
        }
    }
}
