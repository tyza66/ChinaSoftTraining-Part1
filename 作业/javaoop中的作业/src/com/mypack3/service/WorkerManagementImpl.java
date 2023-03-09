package com.mypack3.service;

import com.mypack3.entity.Worker;
import com.mypack3.service.impl.WorkerManagementIF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkerManagementImpl implements WorkerManagementIF {
    List<Worker> workerList = new ArrayList<>();

    @Override
    public void addWorker(Worker worker) {
        workerList.add(worker);
    }

    @Override
    public void removeWorker(int id) {
        Iterator<Worker> iterable = workerList.iterator();
        while (iterable.hasNext()) {
            Worker i = iterable.next();
            if (i.getId() == id) {
                iterable.remove();
            }
        }
    }

    @Override
    public void updateSalary(int id, int salary) {
        Iterator<Worker> iterable = workerList.iterator();
        while (iterable.hasNext()) {
            Worker i = iterable.next();
            if (i.getId() == id) {
                i.setSalary(salary);
            }
        }
    }

    @Override
    public Worker[] queryAllWorkers() {
        return workerList.toArray(new Worker[0]);
    }
}
