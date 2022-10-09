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
        if(numAttempts != 0) {
            return Arrays.copyOf(nums, numAttempts);
        } else {
            return new int[0];
        }
    }

    public int getNum() {
        return nums[numAttempts - 1];
    }

    public void setNumsDim(int num) {
        nums = new int[num];
        numAttempts = 0;
    }
    public void setNum(int num) {
        nums[numAttempts] = num;
        numAttempts++;
    }

    public int getNumAttempts() {
        return numAttempts;
    }

    public void clearAttemps() {
        if(numAttempts != 0) Arrays.fill(nums,0, numAttempts - 1, 0);
    }
}