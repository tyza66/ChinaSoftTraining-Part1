package 第四题;

public class Question {
    String question;
    String[] options = new String[4];
    int answer;

    public void show() {
        System.out.println(question);
        for (int i = 0; i <= 3; i++) {
            System.out.println(options[i]);
        }
        System.out.println("答案：" + answer);
    }

    public void getAnswer() {
        System.out.println("答案：" + answer);
    }

    public void getOpition(int i) {
        if (i >= 1 && i <= 4) {
            System.out.println(options[i-1]);
        } else {
            System.out.println("你需要输入1-4的数字获得对应的选项");
        }
    }
}
