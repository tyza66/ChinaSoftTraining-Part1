package 经理和程序员;

public class Coder {
    private String name;
    private int id;
    private int salary;

    public Coder() {
    }

    public Coder(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"的程序员正在努力的写着代码......");
    }
}
