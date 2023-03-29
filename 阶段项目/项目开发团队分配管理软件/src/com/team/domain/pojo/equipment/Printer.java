package com.team.domain.pojo.equipment;

import com.team.domain.interfaces.Equipment;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 19:03
 * Github: https://github.com/tyza66
 */
public class Printer implements Equipment {
    private String name;//机器名称
    private String type;//类型
    public Printer(){}

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name+ "(" +type+ ")" ;
    }
}
