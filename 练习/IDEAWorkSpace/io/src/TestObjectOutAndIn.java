import java.io.*;

public class TestObjectOutAndIn {
    public static void main(String[] args) {
        try {
            output();
            input();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void output() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\练习\\IDEAWorkSpace\\io\\giao.txt"));
        Student student1 = new Student(1,"小米");
        objectOutputStream.writeObject(student1);
        objectOutputStream.close();
    }

    public static void input() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\练习\\IDEAWorkSpace\\io\\giao.txt"));
        Student s = (Student) objectInputStream.readObject();
        System.out.println(s);
        objectInputStream.close();
    }
}

class Student implements Serializable {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
