package com.studybilibili.homework.homework5;

/**
 * @author Jiawei Zhou
 * 2022/11/7
 */
public class homework25 {
    public static void main(String[] args) {
        Car car = new Car(60);
        car.getAir().flow();
        Car car1 = new Car(-2);
        car1.getAir().flow();
        Car car2 = new Car(20);
        car2.getAir().flow();
    }
}

class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature >40){
                System.out.println("AC is cold");
            } else if(temperature<0){
                System.out.println("AC is hot");
            } else{
                System.out.println("close AC");
            }
        }
    }
    public Air getAir(){
        return  new Air();
    }
}
