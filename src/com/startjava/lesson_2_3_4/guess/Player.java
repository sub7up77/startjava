package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] nums;

    public Player(String name, int numAttempts) {
        this.name = name;
        nums = new int[numAttempts];
    }

    public String getName() {
        return name;
    }

    public int getNum(int pos) {
        return nums[pos];
    }

    public void setNum(int num, int pos) {
        nums[pos] = num;
    }

    public void printAttemps() {
        int pos = 0;
        while(pos < this.nums.length && this.nums[pos] != 0) pos++;
        if(pos != 0) {
            for (int num : Arrays.copyOf(this.nums, pos)) {
                System.out.printf("%-3d", num);
            }
        }
    }

    public void clearAttemps() {
        int pos = 0;
        while(pos < this.nums.length && this.nums[pos] != 0) pos++;
        if(pos != 0) Arrays.fill(this.nums,0, pos - 1, 0);
    }
}