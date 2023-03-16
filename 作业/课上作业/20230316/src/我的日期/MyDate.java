package 我的日期;

public class MyDate {
    int y;
    int m;
    int d;

    public MyDate(){}

    public MyDate(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public String toString(){
        return String.format("%d年%d月%d日",y,m,d);
    }
}
