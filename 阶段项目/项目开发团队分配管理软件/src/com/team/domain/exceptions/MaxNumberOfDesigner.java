package com.team.domain.exceptions;

/**
 * Author: tyza66
 * CreateTime: 2023-03-30 09:18
 * Github: https://github.com/tyza66
 */
public class MaxNumberOfDesigner extends Exception {
    String message = "团队最多有两名设计师";

    @Override
    public String toString() {
        return message;
    }
}