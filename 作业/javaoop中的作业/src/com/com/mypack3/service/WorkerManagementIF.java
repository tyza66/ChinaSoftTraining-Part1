package com.com.mypack3.service;

import com.mypack3.entity.Worker;

import java.util.ArrayList;
import java.util.List;

public interface WorkerManagementIF {
    List<Worker> workerList = null;

    public void addWorker(Worker worker);
    public void removeWorker(int id);
    public void updateSalary(int id,int salary);
    public Worker[] queryAllWorkers();
}
