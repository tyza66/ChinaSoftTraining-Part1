package com.mypack.service;

import com.mypack.entity.Person;

public class ArrayPeopleManagement implements PeopleManagementIF {

    //属性 初始大小100

    Person[] arr=new Person[100];
    int index=-1;//下标

    //方法
    //添加方法
    @Override
    public void addPerson(Person p){
        arr[++index]=p;
    }

    //查询所有
    @Override
    public void  queryAllPerson(){
        //循环遍历的时候是循环里面已有的元素对象，而不是整个数组长度
        for(int i=0;i<=index;i++){
            Person p=arr[i];
            p.show();
        }
    }

    //查询单个
    @Override
    public void queryPersonById(int id){
        //先循环在判断
        for(int i=0;i<=index;i++){
            Person p=arr[i];
            if(p.getId()==id){
                p.show();
            }
        }
    }

    //修改单个
    @Override
    public void updatePersonById(int id, String newname){
        //先循环在判断
        for(int i=0;i<=index;i++){
            Person p=arr[i];
            if(p.getId()==id){
               p.setName(newname);
            }
        }
    }
    //删除的逻辑
    @Override
    public void deleteOne(int id){
        //先循环在判断
        for(int i=0;i<=index;i++){
            Person p=arr[i];
            if(p.getId()==id){
                //数组的删除原理： 将要删除的元素后面的每个值往前推以为，元素总下标-1
               // 1  2  3 4 5
                for(int j=i;j<index;j++){
                    arr[j]=arr[j+1];
                }
            }

        }
        index--;
    }
}
