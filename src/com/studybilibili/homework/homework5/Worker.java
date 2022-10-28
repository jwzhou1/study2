package com.studybilibili.homework.homework5;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.println("===Worker===");
        super.printSal();
    }
}
