package 枚举;

public class TestWeek {
    public static void main(String[] args) {

        //Week w=new Week();//不能被初始化
        Week w1 = Week.valueOf("星期一");
        System.out.println(w1);
        System.out.println(w1.name());//获取他的名称
        System.out.println(w1.ordinal());//获取他的下标

        Week w2=Week.星期二;
        System.out.println(w2);
        System.out.println(w2.name());
        System.out.println(w2.ordinal());

        //获取所有元素
        Week[] weeks = Week.values();
        for(Week week:weeks){
            System.out.print(week+" ");
        }
    }
}
