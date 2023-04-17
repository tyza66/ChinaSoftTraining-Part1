package pojo;

import java.sql.Date;

/**
 * Author: tyza66
 * Date: 2023/04/14 10:46
 * Github: https://github.com/tyza66
 */
public class Student {
    int id;
    String name;
    int age;
    Date birthday;
    String address;
    String photo;

    public Student() {
    }

    public Student(int id, String name, int age, Date birthday, String address, String photo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
