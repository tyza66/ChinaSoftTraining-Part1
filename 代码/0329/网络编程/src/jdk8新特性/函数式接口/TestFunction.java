package jdk8新特性.函数式接口;

public class TestFunction {
    public static void main(String[] args) {
        Converter<String,Integer> converter=(from)->Integer.valueOf(from);

        Integer convert = converter.convert("123");
        System.out.println(convert);
    }
}
