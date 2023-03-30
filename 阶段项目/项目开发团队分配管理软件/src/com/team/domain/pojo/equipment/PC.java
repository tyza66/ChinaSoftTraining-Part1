package com.team.domain.pojo.equipment;

import com.team.domain.interfaces.Equipment;

/**
 * Author: tyza66
 * CreateTime: 2023-03-29 18:28
 * Github: https://github.com/tyza66
 */
public class PC implements Equipment {
    private String model;//电脑型号
    private String display;//显示器

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }

    public String toString() {
        if (model != null && display != null) {
            return model + "(" + display + ")";
        }
        return "\t";
    }
}

