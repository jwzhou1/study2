package com.houserent.view;

import com.houserent.domain.House;
import com.houserent.service.HouseService;
import com.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(2);
    public void update() {
        System.out.println("======Change House Information======");
        System.out.println("Please enter the Change house ID(-1 for exit)");
        int updateId = Utility.readInt();
        if(updateId == -1){
            System.out.println("======You Give Up to Change House Information");
        return;
        }
        House house = houseService.findById(updateId);
        if(house == null){
            System.out.println("======The Searched ID does not Exist======");
            return;
        }
        System.out.print("Name(" + house.getName()+"): ");
        String name = Utility.readString(8,"");
        if("".equals(name)){
            house.setName(name);
        }
        System.out.print("Phone(" + house.getPhone()+"): ");
        String phone = Utility.readString(12,"");
        if(!"".equals(phone)){
            house.setPhone(phone);
        }
        System.out.print("Address(" + house.getAddress()+"): ");
        String address = Utility.readString(18,"");
        if(!"".equals(address)){
            house.setAddress(address);
        }
        System.out.print("Rent(" + house.getRent()+"): ");
        int rent = Utility.readInt(-1);
        if(rent != -1){
            house.setRent(rent);
        }
        System.out.print("Status(" + house.getState()+"): ");
        String status = Utility.readString(18,"");
        if(!"".equals(status)){
            house.setState(status);
        }
        System.out.println("======Change House Information Successfully======");
    }
    public void findHouse(){
        System.out.println("======Search House Information======");
        System.out.print("Please Enter the Search ID: ");
        int findId = Utility.readInt();
        House house = houseService.findById(findId);
        if(house != null){
            System.out.println(house);
        } else{
            System.out.println("======The Searched ID does not Exist======");
        }
    }
    public void exit(){
        char c = Utility.readConfirmSelection();
        if( c =='Y')
            loop = false;
    }
    public void delHouse() {
        System.out.println("======Delete House======");
        System.out.println("Please Enter Deleted House ID(-1 Exit): ");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("======You Give Up to Delete House Information");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            if(houseService.del(delId)){
                System.out.println("======Delete House Information Successfully======");
            } else {
                System.out.println("======Delete House ID does not exist, Delete failed ======");
            }
        } else{
            System.out.println("======You Give Up to Delete House Information");
        }
    }
    public void addHouse() {
        System.out.println("======Add House======");
        System.out.print("Name: ");
        String name = Utility.readString(8);
        System.out.print("Tel: ");
        String phone = Utility.readString(12);
        System.out.print("Address: ");
        String address = Utility.readString(16);
        System.out.print("Monthly Rent: ");
        int rent = Utility.readInt();
        System.out.print("Status: ");
        String state = Utility.readString(10);
        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)){
            System.out.println("======Add House Successfully======");
        } else{
            System.out.println("======Add House Failed======");
        }
    }
    public void listHouses() {
        System.out.println("=====House List=====");
        System.out.println("ID\t\tHouse Owner\t\tTel\t\tAddress\t\tMonthly Rent\t\t Status(Rent/Not Rent");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("======Show House List Completed");
    }
    public void mainMenu() {
        do {
            {
                System.out.println("=====House Rent System Menu=====");
                System.out.println("\t\t\t1 Add New House ");
                System.out.println("\t\t\t2 Search House ");
                System.out.println("\t\t\t3 Delete House Information ");
                System.out.println("\t\t\t4 Change House Information ");
                System.out.println("\t\t\t5 House List ");
                System.out.println("\t\t\t6 Exit ");
                System.out.println("Please enter your choice(1-6): ");
                key = Utility.readChar();
                switch (key) {
                    case '1':
                        addHouse();
                        break;
                    case '2':
                        findHouse();
                        break;
                    case '3':
                        delHouse();
                        break;
                    case '4':
                       update();
                        break;
                    case '5':
                        listHouses();
                        break;
                    case '6':
                        exit();
                        break;
                }
            }
        } while (loop);
    }
}
