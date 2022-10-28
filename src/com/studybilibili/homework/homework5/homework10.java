package com.studybilibili.homework.homework5;

public class homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack", "dentist", 20, 'm', 30000);
        Doctor doctor2 = new Doctor("jack", "dentist", 20, 'm', 30000);
        System.out.println(doctor1.equals(doctor2));
    }
}
