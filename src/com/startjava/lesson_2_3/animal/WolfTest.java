package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setMale(true);
        wolfOne.setNickName("Petya");
        wolfOne.setWeight(32.2f);
        wolfOne.setAge(9);
        wolfOne.setColor("grey");
        System.out.println("\nis male? " + wolfOne.isMale());
        System.out.println("nickname: " + wolfOne.getNickName());
        System.out.println("weight: " + wolfOne.getWeight());
        System.out.println("age: " + wolfOne.getAge());
        System.out.println("color: " + wolfOne.getColor());
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}