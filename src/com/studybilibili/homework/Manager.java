package com.studybilibili.homework;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    @Override
    public void printSal() {
        System.out.println("Manager " + getName() + " salary = " + (bonus
                + getDaySal()*getWorkDays()*getGrade()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
