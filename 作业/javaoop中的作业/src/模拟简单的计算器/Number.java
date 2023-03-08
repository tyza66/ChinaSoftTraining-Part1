package 模拟简单的计算器;

public class Number {
    //定义名为Number的类，其中有两个整型数据成员 属性 n1和n2。编写构造方法，赋予n1和n2初始值，再为该类定义加（addition）、减（subtration）、
    //乘（multiplication）、除（division）等公有成员方法，分别对两个成员变量执行加、减、乘、除的运算。
    int n1, n2;

    public Number() {
        this.n1 = 0;
        this.n2 = 1;
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int addition(){
        return n1+n2;
    }
    public int subtration(){
        return n1-n2;
    }
    public int multiplication(){
        return n1*n2;
    }
    public double division(){
        return (double)n1/(double)n2;
    }
}
