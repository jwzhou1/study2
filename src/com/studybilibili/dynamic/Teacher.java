package com.studybilibili.dynamic;

public class Teacher extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return "teacher" + super.say() + " salary = " +salary;
    }
    public void teach(){
        System.out.println("teacher " + getName() + " teaches java");
    }
}
