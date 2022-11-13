package com.studybilibili.extend;

/**
 * @author Jiawei Zhou
 * 2022/11/10
 */
public class CustonException {
    public static void main(String[] args) throws AgeException {
        int age = 80;
        if(!(age >= 18 && age <=120)){
            throw new AgeException("age between 18-120");
        }
        System.out.println("your age is correct");
    }
}
class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}
