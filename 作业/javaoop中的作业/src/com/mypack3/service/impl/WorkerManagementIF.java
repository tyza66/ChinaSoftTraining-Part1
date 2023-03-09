package com.mypack3.service.impl;

import com.mypack3.entity.Worker;

import java.util.ArrayList;
import java.util.List;

public interface WorkerManagementIF {
    List<Worker> workerList = null;

    void addWorker(Worker worker);
    void removeWorker(int id);
    void updateSalary(int id,int salary);
    Worker[] queryAllWorkers();
    Worker queryOne(int id);
}
