package com.studybilibili.polyparameter;

/**
 * @author Jiawei Zhou
 * 2022/11/5
 */
public class Enumerations02 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}
enum Season{

//    public static final Season SPRING = new Season("Spring", "warm");
//    public static final Season WINTER = new Season("Winter", "cold");
//    public static final Season SUMMER = new Season("Summer", "cool");
//    public static final Season AUTUMN = new Season("Autumn", "hot");
    SPRING("Spring", "warm"),WINTER("Winter", "cold"),
    SUMMER("Summer", "cool"),AUTUMN("Autumn", "hot");
    private String name;
    private String desc;
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
