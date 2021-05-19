package com.Enumeration;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
        Season spring = new Season("spring", "warm");
        Season summer = new Season("summer", "hot");
        Season autumn = new Season("autumn", "cool");
        Season winter = new Season("winter", "cold");
    }
}
class Season {
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
