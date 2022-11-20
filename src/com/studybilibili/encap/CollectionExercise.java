package com.studybilibili.encap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Jiawei Zhou
 * 2022/11/18
 */
public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("dog1",3));
        list.add(new Dog("dog2",30));
        list.add(new Dog("dog3",37));
        for (Object dog :list) {
            System.out.println("dog = " +dog);
        }
        System.out.println("======================");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object dog = iterator.next();
            System.out.println("dog =" +dog);
        }
    }
}

class Dog {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
