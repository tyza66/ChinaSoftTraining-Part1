package com.team.domain.exceptions;

/**
 * Author: tyza66
 * CreateTime: 2023-03-30 09:07
 * Github: https://github.com/tyza66
 */
public class TeamFullException extends Exception {
    String message = "成员已满，无法添加";

    @Override
    public String toString() {
        return message;
    }
}
