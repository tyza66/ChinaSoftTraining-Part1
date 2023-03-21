# Java中值传递和引用传递的区别

在Java中参数的传递主要有两种：值传递和参数传递；

下面是对两种传递方式在内存上的分析：

一：值传递

解释:实参传递给形参的是值  形参和实参在内存上是两个独立的变量 对形参做任何修改不会影响实参

代码示例如下：

 

[![复制代码](https://common.cnblogs.com/images/copycode.gif)](javascript:void(0);)

```
package arrayDemo;
public class Demo1 {
        public static void main(String[] args) {
                int b =20;
                change(b);// 实参  实际上的参数
                System.out.println(b);
        }
        public static void change(int a){//形参  形式上的参数
                a=100;
        }
}
```

[![复制代码](https://common.cnblogs.com/images/copycode.gif)](javascript:void(0);)

结果：20

为什么？看下面分析：

 

![img](https://img2018.cnblogs.com/blog/1174886/201903/1174886-20190321210315087-130227924.png)

通俗的讲法就是：形参只是实参创建的一个副本，副本改变了，原本当然不可能跟着改变；

再通俗的讲法就是：

小明去餐厅吃饭，看见别人点的红烧肉挺好吃，九把服务员叫过来，说我要一份红烧肉，服务员从后厨拿来一份红烧肉，小明吃完了，但是他吃的红烧肉跟旁边那个人吃的是一份吗？当然不是。

再来解释引用传递

二：引用传递

实参传递给形参的是参数对于 堆内存上的引用地址 实参和 形参在内存上指向 了同一块区域  对形参的修改会影响实参

 

[![复制代码](https://common.cnblogs.com/images/copycode.gif)](javascript:void(0);)

```
package arrayDemo;
public class Demo1 {
        public static void main(String[] args) {
                int [] a={1,2,3};
                System.out.println(a[0]);
                change(a);
                System.out.println(a[0]);
        }
        public static void change(int[] a ){
                a[0]=100;
        }
}
```

[![复制代码](https://common.cnblogs.com/images/copycode.gif)](javascript:void(0);)

结果：1    100

为什么？

![img](https://img2018.cnblogs.com/blog/1174886/201903/1174886-20190321210923007-411166564.png)

由于引用传递，传递的是地址，方法改变的都是同一个地址中的值，

原来a[0]指向0x13地址，值是1，

后来在a[0] 指向的也是0x13地址，将值变成了100

所以，再查询a[0]的值的时候，值自然变成了100

通俗点的讲法就是：

小明回到家，他妻子说：冰箱二层有一只鸡，你去做了；

小明做好了，叫妻子过来吃饭。

这个时候，他妻子现在看见的鸡和她买回来的一样吗？

当然不一样，都做熟了；

什么意思呢？

鸡就是数据

冰箱二层就是存储数据的地址

把鸡做熟了就是相当于把值改变了

地方还是那个地方，就是鸡变了。