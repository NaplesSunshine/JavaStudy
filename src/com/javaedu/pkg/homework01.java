package com.javaedu.pkg;

public class homework01 {
    public static void main(String[] args) {
        Person1[] person1s = new Person1[3];
        person1s[0] = new Person1("Jack", 18, "Student");
        person1s[1] = new Person1("Mark", 17, "Li");
        person1s[2] = new Person1("Dk", 32, "Teacher");

        person1s[1].BubbleSort(person1s);
        person1s[1].printArr(person1s);
    }
}

class Person1 {
    public String name;
    public int age;
    public String job;

    public Person1(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Person1[] BubbleSort(Person1[] person1s) {
        //Person1 temp = new Person1(null, 0 , null);
        Person1 temp = null;
        for (int i = 0; i < person1s.length - 1; i++) {
            for (int j = 0; j < person1s.length - 1 - i; j++) {
                if (person1s[j].age > person1s[j + 1].age) {
                    temp = person1s[j];
                    person1s[j] = person1s[j + 1];
                    person1s[j + 1] = temp;
                }
            }
        }
        return person1s;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public void printArr(Person1[] person1s) {
        for (int i = 0; i < person1s.length; i++) {
            System.out.println(person1s[i].toString());
        }
    }

}
