package com.team.domain;
//电脑类
public class PC implements Equipment {
    private String model;//电脑型号
    private String display;//显示器

    public PC(){}

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
