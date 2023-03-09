package 异常作业;

public class Student {
    int age;
    public Student(int age) throws Exception {
        if (age>150){
            throw new AgeGT150Exception();
        }
        if(age<0){
            throw new AgeLT0Exception();
        }
        this.age = age;
    }
}

class AgeGT150Exception extends Exception{

}

class AgeLT0Exception extends Exception{

}