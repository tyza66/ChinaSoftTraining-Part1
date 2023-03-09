package com.mypack3.test;

import com.mypack3.entity.Worker;
import com.mypack3.service.WorkerManagementImpl;
import com.mypack3.service.impl.WorkerManagementIF;
import com.mypack3.entity.sub.Employee;
import com.mypack3.entity.sub.Manager;

public class Test {
    public static void main(String[] args) {
        WorkerManagementIF workers = new WorkerManagementImpl();
        Employee employee1 = new Employee(1, "小明", 18 ,'男', 180,9998,6666);
        Manager manager1 = new Manager(2, "小亮", 18 ,'女', 180,9999,6666,88);
        workers.addWorker(employee1);
        workers.addWorker(manager1);
        for(Worker i:workers.queryAllWorkers()){
            System.out.println(i.toString());
        }
        System.out.println("==================");
        workers.removeWorker(1);
        for(Worker i:workers.queryAllWorkers()){
            System.out.println(i.toString());
        }
        System.out.println("==================");
        workers.addWorker(employee1);
        workers.updateSalary(2,9966);
        for(Worker i:workers.queryAllWorkers()){
            System.out.println(i.toString());
        }
        System.out.println("==================");
        System.out.println(workers.queryOne(2).toString());
    }
}
