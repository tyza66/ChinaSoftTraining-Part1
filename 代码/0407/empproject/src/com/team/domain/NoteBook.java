package com.team.domain;

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
}
