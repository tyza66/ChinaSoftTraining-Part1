package com.team.domain.exceptions;

/**
 * Author: tyza66
 * CreateTime: 2023-03-30 09:19
 * Github: https://github.com/tyza66
 */
public class MaxNumberOfProgrammer extends Exception {
    String message = "团队中至多只能有三名程序员";

    @Override
    public String toString() {
        return message;
    }
}
