package com.team.domain.exceptions;

/**
 * Author: tyza66
 * CreateTime: 2023-03-30 09:16
 * Github: https://github.com/tyza66
 */
public class MaxMumberOfArchitect extends Exception {
    String message = "团队只能有一个架构师";

    @Override
    public String toString() {
        return message;
    }
}
