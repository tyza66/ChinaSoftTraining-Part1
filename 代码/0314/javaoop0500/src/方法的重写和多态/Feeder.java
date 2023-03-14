package 方法的重写和多态;

public class Feeder {
    //实现饲养员给动物喂食物的效果饲养
    String name;

    /*public void feed(Cat c){
        System.out.println(this.name+"给"+c.name+"喂食物");
        c.eat();
    }

    public void feed(Dog d){
        System.out.println(this.name+"给"+d.name+"喂食物");
        d.eat();
    }*/
    public void feed(Animal a){
        System.out.println(this.name+"给"+a.name+"喂食物");
        a.eat();
    }
}
class Test3{
    public static void main(String[] args) {
        Feeder f=new Feeder();
        f.name="张三";

        Cat c=new Cat();
        c.name="kitty";

        f.feed(c);

        Dog d=new Dog();
        d.name="旺财";
        f.feed(d);
    }

}
