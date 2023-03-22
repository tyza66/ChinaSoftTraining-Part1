package 第四题;

public class Question {
    String question;
    String[] options;
    String answer;

    public Question() {
    }

    public Question(String question, String[] options, String answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public void show() {
        System.out.println(question);
        for (int i = 0; i <= options.length-1; i++) {
            System.out.println(options[i]);
        }
        System.out.println("答案：" + answer);
    }

    public void getAnswer() {
        System.out.println("答案：" + answer);
    }

    public void getOpition(int i) {
        if (i >= 1 && i <= answer.length()) {
            System.out.println(options[i-1]);
        } else {
            System.out.println("你需要输入1-"+answer.length()+"的数字获得对应的选项");
        }
    }
}
