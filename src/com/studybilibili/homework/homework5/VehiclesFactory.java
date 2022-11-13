package com.studybilibili.homework.homework5;

public class VehiclesFactory {
    public static Horse horse = new Horse();
    public static Horse getHorse() {
//        return new Horse();
//    }
        return horse;
    }
    public static Boat getBoat() {
        return new Boat();
    }
    public static Plane getPlane() {
        return new Plane();
    }
}
