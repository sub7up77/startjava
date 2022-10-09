package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private static final int NUM_ATTEMPTS = 10;
    private int targetNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        System.out.println("\nУ каждого игрока по " + NUM_ATTEMPTS + " попыток");
        player1.setNumsDim(NUM_ATTEMPTS);
        player2.setNumsDim(NUM_ATTEMPTS);
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        targetNum = random.nextInt(100) + 1;
        player1.clearAttemps();
        player2.clearAttemps();
        System.out.println();
        for (int i = 0; i < NUM_ATTEMPTS; i++) {
            if(isGuessed(player1, in)) break;
            if(isGuessed(player2, in)) break;
        }
        printNums(player1.getNums());
        printNums(player2.getNums());
    }

    private boolean isGuessed(Player player, Scanner in) {
        System.out.print(player.getName() + ", введите предполагаемое число в интервале (0,100]: ");
        player.setNum(in.nextInt());
        if(compareNums(player.getNum())) {
            System.out.println("\n" + player.getName() + " угадал число " + targetNum + " с " +
                    player.getNumAttempts() + " попытки");
            return true;
        }
        if(player.getNumAttempts() == NUM_ATTEMPTS) System.out.println("У " + player.getName() +
                " закончились попытки");
        return false;
    }

    private boolean compareNums(int num) {
        if(num != targetNum) {
            System.out.println("Число " + num + (num < targetNum ? " меньше" : " больше") +
                    " того, что загадал компьютер");
            return false;
        }
        return true;
    }

    private void printNums(int[] nums) {
        System.out.println();
        if (nums.length != 0) {
            for (int num : nums) {
                System.out.printf("%-3d", num);
            }
        }
    }
}
