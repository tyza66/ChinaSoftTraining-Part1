package com.team.domain.exceptions;

/**
 * Author: tyza66
 * CreateTime: 2023-03-30 09:11
 * Github: https://github.com/tyza66
 */
public class OneIsNotAProgrammer extends Exception {
    String message = "该成员不是开发人员，无法添加";

    @Override
    public String toString() {
        return message;
    }
}
