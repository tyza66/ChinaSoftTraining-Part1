package com.mypack2.service;

import com.mypack.service.PeopleManagementIF;
import com.mypack2.entity.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class PeopleManagement implements PeopleManagementIF {
    ArrayList<Person> person = new ArrayList<Person>();

    public void addOne(Person p) {
        person.add(p);
    }

    public Person queryOne(int id) {
        for (Person i : person) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public Person[] queryAll() {
        return person.toArray(new Person[0]);
    }

    public void deleteOne(int id) {
        Iterator<Person> iterable = person.iterator();
        while(iterable.hasNext()){
            Person i = iterable.next();
            if (i.getId() == id) {
                iterable.remove();
            }
        }
    }

    public void update(int id, String name) {
        for (Person i : person) {
            if (i.getId() == id) {
                i.setName(name);
            }
        }
    }

}
