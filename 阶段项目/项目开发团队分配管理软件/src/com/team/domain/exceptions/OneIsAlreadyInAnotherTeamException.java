package com.team.domain.exceptions;

/**
 * Author: tyza66
 * CreateTime: 2023-03-30 09:15
 * Github: https://github.com/tyza66
 */
public class OneIsAlreadyInAnotherTeamException extends Exception {
    String message = "该员工已是某团队成员";

    @Override
    public String toString() {
        return message;
    }
}
