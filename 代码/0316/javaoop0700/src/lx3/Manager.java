package lx3;

public class Manager {

    private String name;
    private int id;
    private double salary;
    private double bonnus;


    public Manager() {
    }

    public Manager(String name, int id, double salary, double bonnus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonnus = bonnus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonnus() {
        return bonnus;
    }

    public void setBonnus(double bonnus) {
        this.bonnus = bonnus;
    }

    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonnus+"的项目经理正在努力的做着管理工作，分配任务，检查员工提交上来的代码。。。");
    }
}
