package com.studybilibili.homework.homework5;

/**
 * @author Jiawei Zhou
 * 2022/11/7
 */
public class homework24 {
    public static void main(String[] args) {
        Person hi = new Person("hi", new Horse());
        hi.common();
        hi.passRiver();
        hi.common();
        hi.common();
        hi.common();
        hi.passFirehill();
    }
}

interface  Vehicles{
    public void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println(" we use horse");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("use boat for river");
    }
}

class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
//        if(vehicles== null){
        if(!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getBoat();
        }
//        Boat boat = VehiclesFactory.getBoat();
        vehicles.work();
    }
    public void passFirehill(){
//        if(vehicles== null){
        if(!(vehicles instanceof Plane)){
            vehicles = VehiclesFactory.getPlane();
        }
//        Boat boat = VehiclesFactory.getBoat();
        vehicles.work();
    }
    public void common(){
//        if(vehicles== null){
        if(!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.getHorse();
        }
//        Horse horse = VehiclesFactory.getHorse();
        vehicles.work();
    }
}
class Plane implements Vehicles{
    @Override
    public void work() {
        System.out.println("pass the mountain");
    }
}
