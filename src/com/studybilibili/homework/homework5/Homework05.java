package com.studybilibili.homework.homework5;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker("jack", 10000);
        worker.setSalMonth(10);
        worker.printSal();
        Peasant peasant = new Peasant("smith", 20000);
        peasant.printSal();
    }
}
