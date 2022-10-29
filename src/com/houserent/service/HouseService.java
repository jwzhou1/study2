package com.houserent.service;

import com.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 1;
    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"jack","112","Shanghai",2000,"not rent");

    }
    public House findById(int findId){
        for (int i = 0; i < houseNums; i++) {
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(delId==houses[i].getId()){
                index = i;
            }
        }
        if(index == -1) {
            return false;
        }
        for (int i = 0; i < houseNums - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNums] = null;
        // houseNums--;
        return true;
    }
    public boolean add(House newHouse){
        if(houseNums == houses.length) {
            System.out.println("Array is full, you cannot add more.");
            return false;
        }
        //houseNums++;
        houses[houseNums++] = newHouse;
        // idCounter++;
        newHouse.setId(++idCounter);
        return true;
    }

    public House[] list() {
        return houses;
    }
}
