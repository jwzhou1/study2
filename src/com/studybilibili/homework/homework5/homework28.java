package com.studybilibili.homework.homework5;

import java.util.Scanner;

/**
 * @author Jiawei Zhou
 * 2022/11/12
 */
public class homework28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String price = "12345631.59";
        StringBuffer sb = new StringBuffer(price);
//        int i = sb.lastIndexOf(".");
//        sb = sb.insert(i - 3, ",");
        for(int i = sb.lastIndexOf(".")-3; i >0; i -=3 ){
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
