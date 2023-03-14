package 方法的重写和多态;

public class Cat extends Animal {

    /**
     * 方法的重写： override
     * 方法的名称，返回值类型，参数列表一致，但是方法里面的逻辑不一样
     * 用在子类里面，子类重写父类里面相应的逻辑；执行的是重写之后的逻辑
     */
    public void eat(){
        System.out.println("猫再吃");
    }

    public void climbTree(){
        System.out.println("猫在爬树");
    }
}


