# Java内部类详解

# 内部类

## 内部类的定义

将一个类定义在另一个给类里面或者方法里面，这样的类就被称为内部类。
内部类可以分为四种:**成员内部类、局部内部类、匿名内部类、静态内部类**，下面我们逐一介绍这四种内部类。

## 成员内部类

他定义在另一个类中。一般定义格式如下

```
class C{
    class D{

    }
}
```

因为类C相对与类D在外面，我们且称类C为外部类。
**成员内部类可以无条件访问外部类的属性和方法，但是外部类想要访问内部类属性或方法时，必须要创建一个内部类对象，然后通过该对象访问内部类的属性或方法**

### 成员内部类无条件访问外部类的属性和方法

```
class C{
    private String name = "外部类";
    public void run(){
        System.out.println("外部类奔跑");
    }
    class D{
        public void say(){
            System.out.println(name);
            run();
        }
    }
}
```

### 外部类访问内部类属性和方法

```
class C{
    private String name = "外部类";
    public void run(){
        System.out.println("外部类奔跑");
    }
    /*使用内部类的属性和方法*/
    public void eat(){
        D d = new D();
        System.out.println(d.value);
        d.say();
    }
    class D{
        private String value = "DDD";
        public void say(){
            System.out.println(name);
            run();
        }
    }
}
```

### 外部类属性或方法隐藏

如果成员内部类的属性或者方法与外部类的同名，将导致外部类的这些属性与方法在内部类被隐藏，也可按照该格式调用，外部类.this.属性/方法。

```
class C{
    private String name = "外部类";
    public void run(){
        System.out.println("外部类奔跑");
    }
    /*使用内部类的属性和方法*/
    public void eat(){
        D d = new D();
        System.out.println(d.value);
        d.say();
    }
    class D{
        private String value = "DDD";
        private String name = "内部类";
        public void say(){
            System.out.println(C.this.name);
            System.out.println(name);
            run();
        }
    }
}
```

### 创建内部类对象

显然成员内部类是寄生于外部类，创建内部类对象就必须先创造外部类对象。之后创建内部类有两种方式。

```
public class Test10 {
    public static void main(String[] args) {
        /*方式1创建成员内部类对象*/
        C c = new C();
        C.D d = c.new D();
        /*方式2创建成员内部类对象*/
        C.D d1 = c.getClassD();
    }
}
class C{
    private String name = "外部类";
    public void run(){
        System.out.println("外部类奔跑");
    }
    /*创建一个返回D对象的方法*/
    public D getClassD(){
        return new D();
    }
    /*使用内部类的属性和方法*/
    public void eat(){
        D d = new D();
        System.out.println(d.value);
        d.say();
    }
    class D{
        private String value = "DDD";
        private String name = "内部类";
        public void say(){
            System.out.println(C.this.name);
            System.out.println(name);
            run();
        }
    }
}
```

### 成员内部类的访问权限

成员内部类前可加上四种访问修饰符。
**private**：仅外部类可访问。
**protected**：同包下或继承类可访问。
**default**：同包下可访问。
**public**：所有类可访问。

------

## 局部内部类

局部内部类存在于方法中。
他和成员内部类的区别在于局部内部类的访问权限仅限于方法或作用域内。

```
class K{
    public void say(){
        class J{
            
        }
    }
}
```

**注意事项**：局部内部类就像局部变量一样，前面不能访问修饰符以及static修饰符。

------

## 匿名内部类

下面我们先通过一段代码初步了解一下匿名内部类。

```
public class Test13 {
    public static void main(String[] args) {
        driveCar(new Car(){
            @Override
            public void drive() {
                System.out.println("驾驶着BMW汽车");
            }
        });
    }
    public static void driveCar(Car car){
        car.drive();
    }
}

interface Car {
    void drive();
}
```

分析以上代码知道静态方法driveCar需要一个Car对象，我们通过实现接口创建一个匿名类对象传递过去。事实上还可以通过继承类来创建一个匿名内部类对象。
**注意事项**：匿名内部类没有构造方法。也是唯一没有构造方法的内部类。**匿名内部类和局部内部类只能访问外部类的final变量。**

------

## 静态内部类

静态内部类和成员内部类相比多了一个static修饰符。它与类的静态成员变量一般，是不依赖于外部类的。同时静态内部类也有它的特殊性。因为外部类加载时只会加载静态域，所以静态内部类不能使用外部类的非静态变量与方法。
同时可以知道成员内部类里面是不能含静态属性或方法的。

```
class U {
    static class I {
        
    }
}
```

## 内部类的好处

1. 完善了Java多继承机制，由于每一个内部类都可以独立的继承接口或类，所以无论外部类是否继承或实现了某个类或接口，对于内部类没有影响。
2. 方便写事件驱动程序。

## 总结

```
public class Test15 {
    public static void main(String[] args) {
        //初始化bean1
        Test15.Bean1 bean1 = new Test15().new Bean1();
        bean1.i++;
        //初始化bean2
        Test15.Bean2 bean2 = new Test15.Bean2();
        bean2.j++;
        //初始化3
        Bean bean = new Bean();
        Bean.Bean3 bean3 = bean.new Bean3();
        bean3.k++;
    }
    class Bean1 {
        public int i = 0;
    }
    static class Bean2 {
        public int j = 0;
    }
}
class Bean {
    class Bean3 {
        public int k = 0;
    }

}
```

静态内部类对象的创建一般是**外部类.内部类 类名 = new 外部类.内部类();**
成员内部类对象的创建一般是**外部类.内部类 类名 = 外部类对象名.new 内部类();**