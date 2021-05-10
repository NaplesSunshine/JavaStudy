package com.javaedu.pkg;

public class homework03 {
    public static void main(String[] args) {
        Teacher f01 = new Professor();
        f01.setName("Ark Bie");
        f01.setAge(35);
        f01.setPost("Professor");
        f01.setLevel(1.3);
        f01.setSalary(5600);

        Teacher f02 = new Lecturer("Bid Dse", 42, "Lecturer", 4500, 1.1);

        f01.introduce();
        f02.introduce();
    }
}
