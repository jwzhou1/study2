package com.studybilibili.homework.homework5;

/**
 * @author Jiawei Zhou
 * 2022/11/7
 */
public class homework26 {
    public static void main(String[] args) {
        Color green = Color.YELLOW;
        green.show();
        switch (green){
            case YELLOW:
                System.out.println("yellow");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case RED:
                System.out.println("red");
                break;
            case BLUE:
                System.out.println("blue");
                break;
            default:
                System.out.println("no match");
        }
    }
}
interface IMyInterface{
    public void show();
}
enum Color implements IMyInterface{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("Attribution:"+redValue+","+greenValue+","+blueValue);
    }
}
