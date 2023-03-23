package 第四题;

import java.io.*;
import java.util.ArrayList;

public class FormatQuestion {
    public static void main(String[] args) throws IOException {
        Question[] qs = parseFile("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\课上作业\\20230322\\驾驶员测试题.txt");
        /*for(Question q  : qs){
            q.show();
        }*/

    }
    public static Question[] parseFile(String fileName) throws IOException {
        File file = new File(fileName);
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "GBK");
        BufferedReader br = new BufferedReader(isr);
        ArrayList<Question> out = new ArrayList();
        //6行一组，快乐读取不可以 因为后面有陷阱 发现后面有俩选项的
        //备选方案就是通过每一行第一个字符是啥来决定了
        String line = "";
        String question = "", answer = "";
        String[] options = new String[4];
        int opitionsNum = 0;
        while ((line = br.readLine()) != null) {
            if (line.charAt(0) >= '0' && line.charAt(0) <= '9') {
                question = line;
            } else if (line.length()!=1&&line.charAt(0) >= 'A' && line.charAt(0) <= 'D') {
                options[opitionsNum] = line;
                opitionsNum++;
            } else if (line.length()==1) {
                answer = line;
                String[] endop = new String[opitionsNum];
                System.arraycopy(options, 0, endop, 0 ,opitionsNum);
                //new Question(question, endop, answer).show();
                out.add(new Question(question, endop, answer));
                opitionsNum = 0;
            }
        }
        return out.toArray(new Question[0]);
    }
}
