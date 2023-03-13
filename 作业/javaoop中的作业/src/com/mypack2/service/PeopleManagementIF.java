package com.mypack2.service;

import com.mypack2.entity.Person;

import java.util.ArrayList;

public interface PeopleManagementIF {
    ArrayList<Person> person = null;

    public void addOne(Person p);

    public Person queryOne(int id);

    public Person[] queryAll();

    public void deleteOne(int id);

    public void update(int id, String name);
}
