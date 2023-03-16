package com.mypack.service;

import com.mypack.entity.Worker;

public interface WorkerManagementIF {

    public void addWorker(Worker worker);

    public void queryAllWorker();

    public void queryOneWorker(int id);

    public void deleteWorkerById(int id);

    //调整工资
    public void updateSalary(int id,double increment);
}
