package 经理和程序员;

public class Test {
    public static void main(String[] args) {
        Manager m= new Manager("小明",1,1,1);
        Coder c = new Coder("老明",2,2);
        m.work();
        c.work();
    }
}
