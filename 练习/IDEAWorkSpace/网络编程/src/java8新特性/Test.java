package java8新特性;

public interface Test {
    int test();
    default int one(){
        return 1;
    }
}
