package com.studybilibili.homework.homework5;

/**
 * @author Jiawei Zhou
 * 2022/11/7
 */
public class homework21 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}
    abstract class Animal{
    public abstract void shout();
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("cat miao miao");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("dog wang wang");
    }
}
