package com.studybilibili.homework.homework5;

public class Peasant extends Employee{
    public Peasant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.println("===Peasant===");
        super.printSal();
    }
}
