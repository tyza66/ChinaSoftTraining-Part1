package com.mypack.service;

import com.mypack.entity.Person;

public class PeopleManagement {
    Person[] p = new Person[99];
    int sum = 0;

    public void addOne(Person p) {
        this.p[sum] = p;
        sum++;
    }


    public void queryOne(int id) {
        for (int i = 1; i <= sum; i++) {
            if (p[i - 1].getId() == id) {
                System.out.println(p[i - 1].getName());
                break;
            }
        }
    }

    public void queryAll() {
        for (int i = 1; i <= sum; i++) {
            System.out.println(p[i - 1].getName());
        }
    }

    public void deleteOne(int id) {
        int find = 0;
        Person temp;
        for (int i = 1; i <= 10; i++) {
            if (p[i - 1].getId() == id) {
                find = i;
                temp = p[sum - 1];
                p[sum - 1] = p[find - 1];
                p[find - 1] = temp;
                p[sum - 1] = null;
                sum--;
                break;
            }
        }
    }

    public void update(int id, String name) {
        for (int i = 1; i <= sum; i++) {
            if (p[i - 1].getId() == id) {
                p[i - 1].setName(name);
                break;
            }
        }
    }
}
