package 作业;

public class Student {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>150){
            try {
                throw new AgeGT150Exception("年龄太大了");
            } catch (AgeGT150Exception e) {
                System.out.println(e.getMessage());
            }
        }else if(age<0){
            try {
                throw new AgeLT0Exception("年龄太小了");
            } catch (AgeLT0Exception e) {
                System.out.println(e.getMessage());
            }
        }else {

            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class AgeGT150Exception extends Exception{
    public AgeGT150Exception(String message) {
        super(message);
    }
}

class AgeLT0Exception extends Exception{
    public AgeLT0Exception(String message) {
        super(message);
    }
}
