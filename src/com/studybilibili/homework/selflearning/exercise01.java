package com.studybilibili.homework.selflearning;

import java.util.Scanner;

/**
 * @author Jiawei Zhou
 * 2022/11/9
 */
public class exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int num = scanner.nextInt();
        if(num %4 ==0 && num %100 != 0){
            System.out.println("这是闰年");
        } else{
            System.out.println("不是闰年");
        }
        }
}

