package com.studybilibili.extend;

public class NotePad extends Computer {
    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void getInfo() {
        System.out.println("pc information = ");
        // System.out.println(getCpu()+getMemory()+getDisk());
        System.out.println(getDetails() +" color = " + color);
    }
}
