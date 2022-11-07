package com.studybilibili.homework.homework5;

/**
 * @author Jiawei Zhou
 * 2022/11/7
 */
public class homework23 {
    public static void main(String[] args) {
    new A().f1();
    }
}
class A{
    private String name = "hello";
    public void f1(){
        class B{
            private final String name = "dadada";
            public void show(){
                System.out.println("NAME = " + name+", out class name = " + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
