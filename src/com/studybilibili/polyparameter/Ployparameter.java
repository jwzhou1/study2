package com.studybilibili.polyparameter;

public class Ployparameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milian = new Manager("milian", 5000, 200000);
        Ployparameter ployparameter = new Ployparameter();
        ployparameter.showEmpAnnual(tom);
        ployparameter.showEmpAnnual(milian);
        ployparameter.testWork(tom);
        ployparameter.testWork(milian);
        "hello".equals("abc");
    }

    public void showEmpAnnual(Empolyee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Empolyee e){
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else{
            System.out.println("no result");
    }
    }
}
