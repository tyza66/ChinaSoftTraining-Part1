package com.team.pojo;

public class Architect extends Designer {

    private int stock;//股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, int memberId, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, memberId, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.toString() +
                "stock=" + stock ;
    }
}
