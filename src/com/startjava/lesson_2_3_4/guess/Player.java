package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] nums;
    private int numAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, numAttempts);
    }

    public int getNum() {
        return nums[numAttempts - 1];
    }

    public void setNumsDim(int num) {
        nums = new int[num];
        numAttempts = 0;
    }

    public void addNum(int num) {
        nums[numAttempts] = num;
        numAttempts++;
    }

    public int getNumAttempts() {
        return numAttempts;
    }

    public void clearAttemps() {
        if(numAttempts != 0) Arrays.fill(nums,0, numAttempts, 0);
    }
}