package jdk8新特性.函数式接口;


public interface Converter<F,T> {
    T convert(F from);
}
