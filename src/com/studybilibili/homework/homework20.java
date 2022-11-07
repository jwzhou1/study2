package com.studybilibili.homework;

/**
 * @author Jiawei Zhou
 * 2022/11/7
 */
public class homework20 {
    public static void main(String[] args) {

    }
}
class Frock{
    private  static int currentNum = 100000;
    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        serialNumber = getNextNum();
    }

    public static int getNextNum(){
        currentNum+= 100;
        return currentNum;
    }
}
class TestFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());
    }
}
