package com.studybilibili.exception;

/**
 * @author Jiawei Zhou
 * 2022/11/8
 */
public class example01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int res = a/b;
        } catch (Exception e) {
            System.out.println("exception = " + e.getMessage());
        }
        System.out.println("run...");
    }
}
