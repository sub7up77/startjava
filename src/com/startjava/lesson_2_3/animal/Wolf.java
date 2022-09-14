package com.startjava.lesson_2_3.animal;

public class Wolf {

    private boolean male;
    private String nickName;
    private float weight;
    private int age;
    private String color;

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("It's going.");
    }

    public void sit() {
        System.out.println("It's sitting.");
    }

    public void run() {
        System.out.println("It's running.");
    }

    public void howl() {
        System.out.println("It's howling.");
    }

    public void hunt() {
        System.out.println("It's hunting.");
    }
}
