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
        init();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < NUM_ATTEMPTS; i++) {
            if(isGuessed(player1, in)) break;
            if(isGuessed(player2, in)) break;
        }
        printNums(player1);
        printNums(player2);
    }

    private void init() {
        Random random = new Random();
        targetNum = random.nextInt(100) + 1;
        player1.clearAttemps();
        player2.clearAttemps();
        System.out.println();
    }

    private boolean isGuessed(Player player, Scanner in) {
        String name = player.getName();
        System.out.print(name + ", введите предполагаемое число в интервале (0,100]: ");
        player.addNum(in.nextInt());
        if(compareNums(player.getNum())) {
            System.out.println("\n" + name + " угадал число " + targetNum + " с " +
                    player.getNumAttempts() + " попытки");
            return true;
        }
        if(player.getNumAttempts() == NUM_ATTEMPTS) {
            System.out.println("У " + name + " закончились попытки");
        }
        return false;
    }

    private boolean compareNums(int num) {
        if(num <= 0 || num > 100) {
            System.out.println("Введенное число вне заданного интервала");
            return false;
        } else if(num != targetNum) {
            System.out.println("Число " + num + (num < targetNum ? " меньше" : " больше") +
                    " того, что загадал компьютер");
            return false;
        }
        return true;
    }

    private void printNums(Player player) {
        System.out.println();
        if (player.getNums().length != 0) {
            System.out.print(player.getName() + ": ");
            for (int num : player.getNums()) {
                System.out.printf("%-3d", num);
            }
        }
    }
}
