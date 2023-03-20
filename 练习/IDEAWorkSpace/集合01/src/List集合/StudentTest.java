package List集合;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List ls = new ArrayList();
        Student s1 = new Student("张三",25);
        Student s2 = new Student("李四",25);
        Student s3 = new Student("王五",25);

        ls.add(s1);ls.add(s2);ls.add(s3);
        for(Object o:ls){
            if(((Student)o).name.equals("李四")){
                ((Student)o).name = "李思思";
            }
        }
        System.out.println("修改完成之后的是，"+ls);
        Integer.parseInt("214748364a");
    }
}
