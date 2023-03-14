package 女朋友;

public class Girlfriend {
    private String name;
    private double height;
    private double weight;

    public Girlfriend() {
    }

    public Girlfriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }

    public void cook(){
        System.out.println("女朋友帮我做饭");
    }

    public void show(){
        System.out.println("女朋友的姓名是"+name+"，身高是"+height+"，体重是"+weight);
    }
}
