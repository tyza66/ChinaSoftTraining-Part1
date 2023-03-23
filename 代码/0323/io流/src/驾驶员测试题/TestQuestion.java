package 驾驶员测试题;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TestQuestion {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        File file = new File("D:\\中软103\\代码\\0322\\驾驶员测试题.txt");
        FileUtil fu = new FileUtil();
        List<Question> list = null;
        try {
            list = fu.parseFile(file);
            //System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count=0;
        if(list!=null&&list.size()>0){
            for(Question q:list){
                System.out.println(q.getTitle());
                System.out.println(q.getOptiona());
                System.out.println(q.getOptionb());
                String optionc=q.getOptionc();
                String optiond = q.getOptiond();
                if(optionc!=null){
                    System.out.println(optionc);

                }
                if(optiond!=null){
                    System.out.println(optiond);
                }
                System.out.println("请输入正确答案：");
                String myAnswer = sc.next();
                if(myAnswer!=null&&!"".equals(myAnswer)){
                    if(myAnswer.equalsIgnoreCase(q.getAnswer())){
                        System.out.println("回答正确");
                        count++;
                    }else{
                        System.out.println("回答错误");
                    }
                }
                System.out.println("正确答案是："+q.getAnswer());
            }
        }
        System.out.println("您一共做对了"+count+"道题目");
        System.out.println("总成绩是："+count*100/list.size()+"分");
    }
}
