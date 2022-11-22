package com.datastrcuture.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Jiawei Zhou
 * 2022/11/22
 */
@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1, new Emp("jack",300000,1));
        hashMap.put(2, new Emp("jack1",1000,2));
        hashMap.put(3, new Emp("jack2",1200000,3));
        hashMap.put(4, new Emp("jack3",120000,4));
        hashMap.put(5, new Emp("jack4",1207800,5));
        hashMap.put(6, new Emp("jack5",120090,6));
        Set set = hashMap.keySet();
        for (Object key :set) {
            Emp emp =(Emp) hashMap.get(key);
            if(emp.getSal()>18000){
                System.out.println(emp);
            }
        }
        Set set1 = hashMap.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Emp emp = (Emp) entry.getValue();
            if(emp.getSal()>18000){
                System.out.println(emp);
            }
        }

    }
}

class Emp{
    private String name;
    private double sal;
    private int id;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }
}
