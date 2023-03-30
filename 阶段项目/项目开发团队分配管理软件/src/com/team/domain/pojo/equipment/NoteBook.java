package com.team.domain.pojo.equipment;

import com.team.domain.interfaces.Equipment;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 19:03
 * Github: https://github.com/tyza66
 */
public class NoteBook implements Equipment {
    private String model;//机器型号
    private double price;//价格

    public NoteBook(){}

    public NoteBook(String model, double  price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }

    @Override
    public String toString() {
        return model + "(" + price + ")";
    }
}

