package com.mypack.service;

import com.mypack.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class ListPeopleManagement implements PeopleManagementIF {

    List<Person> list=new ArrayList<>();

    @Override
    public void addPerson(Person p) {
        list.add(p);
    }

    @Override
    public void queryAllPerson() {
        for(Person p:list){
            p.show();
        }
    }

    @Override
    public void queryPersonById(int id) {

        for(Person p:list){
            if(p.getId()==id){
                p.show();
            }
        }
    }

    @Override
    public void updatePersonById(int id, String newname) {

        for(Person p:list){
            if(p.getId()==id){
                p.setName(newname);
            }
        }
    }

    @Override
    public void deleteOne(int id) {

        for(Person p:list){
            if(p.getId()==id){
               list.remove(p);
            }
        }
    }
}
