package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] nums;
    private int numAttempts;
    private int numWins;

    public Player(String name) {
        this.name = name;
        nums = new int[GuessNumber.NUM_ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return nums[numAttempts - 1];
    }

    public boolean addNum(int num) {
        if(num <= 0 || num > 100) {
            System.out.println("Введенное число вне заданного интервала (0, 100]");
            return false;
        }
        nums[numAttempts] = num;
        numAttempts++;
        return true;

    }

    public int[] getNums() {
        return Arrays.copyOf(nums, numAttempts);
    }

    public int getNumAttempts() {
        return numAttempts;
    }

    public void clearAttempts() {
        if(numAttempts != 0) {
            Arrays.fill(nums,0, numAttempts, 0);
            numAttempts = 0;
        }
    }

    public int getNumWins() {
        return numWins;
    }

    public void addNumWins() {
        numWins++;
    }
}