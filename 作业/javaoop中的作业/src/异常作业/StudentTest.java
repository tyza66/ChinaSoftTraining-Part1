package 异常作业;

public class StudentTest {
    public static void main(String[] args) {
        try{
            //new Student(151);
            new Student(-1);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
