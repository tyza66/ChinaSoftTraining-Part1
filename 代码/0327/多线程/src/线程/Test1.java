package 线程;

public class Test1 {

    //实现一边播放歌曲，一边调节音量
    public static void main(String[] args) {
        Test1 t=new Test1();
        t.playMusic();
        t.playVoice();
    }

    public void playMusic(){
        for(int i=1;i<=100;i++){
            System.out.print(i+" ");
        }
    }

    public void playVoice(){
        for(char ch='A';ch<='z';ch++){
            System.out.print(ch+" ");
        }
    }
}
