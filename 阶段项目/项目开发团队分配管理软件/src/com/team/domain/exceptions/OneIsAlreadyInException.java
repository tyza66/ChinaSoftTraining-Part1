package com.team.domain.exceptions;

/**
 * Author: tyza66
 * CreateTime: 2023-03-30 09:14
 * Github: https://github.com/tyza66
 */
public class OneIsAlreadyInException extends Exception {
    String message = "该成员已经在本开发团队中";

    @Override
    public String toString() {
        return message;
    }
}
