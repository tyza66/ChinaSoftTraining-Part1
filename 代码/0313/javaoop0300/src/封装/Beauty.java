package 封装;

public class Beauty {
    private String name;
    private int age;

    /*
    属性私有化，通过公共的gettersetter方法来实现对属性的访问
     */

    //通过方法来实现给属性的赋值
    //setXXX 设置值
    public void setAge(int age){
        this.age=age;
    }

    //getXXX取值
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }


}
