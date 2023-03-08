package 分支结构;

public class TestIf {
    public static void main(String[] args) {
       // if(条件表达式){ 语句块1}else if(条件表达式2){语句块2}...else{语句块n}  	 满足哪个条件表达式，执行哪个语句块；都不满足，执行语句块n
        int i=125;

        if(i>=0&&i<=100){
            if(i>=90&&i<=100){
                System.out.println("成绩为优秀");
            }else if(i>=80){
                System.out.println("成绩为良好");
            }else if(i>=70){
                System.out.println("成绩为中等");
            }else if(i>=60){
                System.out.println("成绩为及格");
            }else {
                System.out.println("成绩为不及格");
            }
        }else{
            System.out.println("成绩无效");
        }

    }
}
