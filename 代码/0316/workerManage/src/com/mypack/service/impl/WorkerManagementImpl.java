package com.mypack.service.impl;

import com.mypack.entity.Worker;
import com.mypack.service.WorkerManagementIF;

public class WorkerManagementImpl implements WorkerManagementIF {

    Worker[] arr=new Worker[100];
    int index=-1;

    @Override
    public void addWorker(Worker worker) {
        arr[++index]=worker;
    }

    @Override
    public void queryAllWorker() {
        for(int i=0;i<=index;i++){
           Worker w= arr[i];
           w.show();
        }
    }

    @Override
    public void queryOneWorker(int id) {
        for(int i=0;i<=index;i++){
            Worker w= arr[i];
            if(w.getId()==id){
                w.show();
            }

        }
    }

    @Override
    public void deleteWorkerById(int id) {
        for(int i=0;i<=index;i++){
            Worker w= arr[i];
            if(w.getId()==id) {
                // 1 2 3 4 5
                for (int j = i; j < index; j++) {
                    arr[j] = arr[j + 1];
                }
            }

        }
        index--;
    }

    @Override
    public void updateSalary(int id, double increment) {
        for(int i=0;i<=index;i++){
            Worker w= arr[i];
            if(w.getId()==id){
                if(increment>=0){
                    w.setSalary(w.getSalary()+increment);
                }else{
                    System.out.println("工资只能增加，不能降低");
                }
            }

        }
    }
}
