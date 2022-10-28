package com.studybilibili.homework;

public class Worker extends Employee{
    public Worker(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    @Override
    public void printSal() {
        System.out.println("Worker ");
        super.printSal();
    }
}
