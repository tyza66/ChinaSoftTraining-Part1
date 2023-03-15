package 抽象类和接口;

public  class Student extends Person implements Singer,Player{

    //重写抽象类里面的抽象方法
    @Override
    public void work() {
        System.out.println("学生在工作");
    }

    //子类特有的方法
    public void exam(){
        System.out.println("学生在考试");
    }

    //重写Singer接口里面的抽象方法
    @Override
    public void sing() {
        System.out.println("学生在唱歌");
    }
    //重写PLayer接口里面的抽象方法
    @Override
    public void play() {
        System.out.println("学生在运动");
    }
}
