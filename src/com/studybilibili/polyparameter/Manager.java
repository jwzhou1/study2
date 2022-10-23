package com.studybilibili.polyparameter;

public class Manager extends Empolyee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manage() {
        System.out.println("manager " + getName() +" is managing");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
