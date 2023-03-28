public class Person {
    int id;
    String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show(){
        System.out.println(""+id+" "+name);
    }
}
