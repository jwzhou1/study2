package com.studybilibili.homework;

public class homework03 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 100, 20, 1.2);
        jack.setBonus(3000);
        jack.printSal();
        System.out.println("===================");
        Worker coco = new Worker("coco", 50, 10, 1.0);
        coco.printSal();
    }
}
