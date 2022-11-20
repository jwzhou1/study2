package com.studybilibili.encap;

/**
 * @author Jiawei Zhou
 * 2022/11/16
 */
public class homework2 {
    public static void main(String[] args) {
        String name = "HAHA sqeq Pdada";
        printName(name);
    }
    public static void printName(String str){
        if(str == null){
            System.out.println("string不能是空");
            return;
        }
        String[] names = str.split(" ");
        if(names.length !=3){
            System.out.println("输入的格式不对");
            return;
        }
       String format = String.format("%s,%s .%c", names[2],names[0],names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
