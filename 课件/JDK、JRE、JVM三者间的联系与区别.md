# JDK、JRE、JVM三者间的联系与区别

　　有Java编程经验的程序员应该都知道：Java程序是运行在JVM(Java虚拟机)上的，在开发程序之前都要配置Java开发环境，其中首先要做的就是JDK的安装和配置，那么JDK、JVM、JRE到底有何联系和区别呢？想必并不是每一个程序员都能说得清楚的，本文接下来将带你了解它们之间的关系。

![img](https://img2018.cnblogs.com/blog/1362965/201901/1362965-20190114161305916-1522316322.png)

**一、JDK**

　　JDK(Java SE Development Kit)，Java标准开发包，它提供了编译、运行Java程序所需的各种工具和资源，包括Java编译器、Java运行时环境，以及常用的Java类库等。

　　下图是JDK的安装目录：

　　![img](https://img2018.cnblogs.com/blog/1362965/201901/1362965-20190114160755933-897193066.png)

**二、JRE**

 　JRE( Java Runtime Environment) 、Java运行环境，用于解释执行Java的字节码文件。普通用户而只需要安装 JRE（Java Runtime Environment）来运行 Java 程序。而程序开发者必须安装JDK来编译、调试程序。

　　下图是JRE的安装目录：里面有两个文件夹bin和lib，在这里可以认为bin里的就是jvm，lib中则是jvm工作所需要的类库，而jvm和 lib和起来就称为jre。

![img](https://img2018.cnblogs.com/blog/1362965/201901/1362965-20190114161959489-1682755970.png)

**三、JVM**

　　JVM(Java Virtual Mechinal)，Java虚拟机，是JRE的一部分。它是整个java实现跨平台的最核心的部分，负责解释执行字节码文件，是可运行java字节码文件的虚拟计算机。所有平台的上的JVM向编译器提供相同的接口，而编译器只需要面向虚拟机，生成虚拟机能识别的代码，然后由虚拟机来解释执行。

　　当使用Java编译器编译Java程序时，生成的是与平台无关的字节码，这些字节码只面向JVM。不同平台的JVM都是不同的，但它们都提供了相同的接口。JVM是Java程序跨平台的关键部分，只要为不同平台实现了相应的虚拟机，编译后的Java字节码就可以在该平台上运行。

**四、区别与联系**

1. JDK 用于开发，JRE 用于运行java程序 ；如果只是运行Java程序，可以只安装JRE，无序安装JDK。
2. JDk包含JRE，JDK 和 JRE 中都包含 JVM。
3. JVM 是 java 编程语言的核心并且具有平台独立性。