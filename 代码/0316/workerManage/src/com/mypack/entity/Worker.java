package com.mypack.entity;

public abstract class Worker {

    private int id;
    private String name;
    private String jobname;
    private double salary;

    public Worker() {
    }

    public Worker(int id, String name, String jobname, double salary) {
        this.id = id;
        this.name = name;
        this.jobname = jobname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void show();
}
