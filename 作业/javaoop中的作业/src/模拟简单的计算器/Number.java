package 模拟简单的计算器;

public class Number {
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
