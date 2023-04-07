package com.team.domain;
//打印机类
public class Print implements Equipment {
    private String name;//机器名称
    private String type;//类型
    public Print(){}

    public Print(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name+ "(" +type+ ")" ;
    }
}
