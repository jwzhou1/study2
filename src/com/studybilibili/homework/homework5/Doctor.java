package com.studybilibili.homework.homework5;

public class Doctor {
    private String name;
    private String job;
    private int age;
    private char gender;
    private double sal;
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Doctor)) {
            return false;
        }
        Doctor doctor = (Doctor)obj;
        return this.name.equals(doctor.name) && this.age == doctor.age &&
                this.gender == doctor.gender && this.job.equals(doctor.job)
                && this.sal== doctor.sal;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Doctor(String name, String job, int age, char gender, double sal) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.sal = sal;
    }
}
