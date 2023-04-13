package com.team.pojo;

public class PC implements Equipment {

    private String model;//电脑型号
    private String display;//显示器

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return  "model='" + model + ", display='" + display  ;
    }


}
