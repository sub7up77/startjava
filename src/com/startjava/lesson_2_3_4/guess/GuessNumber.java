package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private static final int NUM_ATTEMPTS = 10;
    private int targetNum;
    private Player[] player;

    public GuessNumber(Player... players) {
        player = players;
        for (Player value : player) {
            value.setNumsDim(NUM_ATTEMPTS);
        }
    }

    public void launch(int numRound) {
        System.out.println("\nРаунд " + numRound);
        System.out.println("У каждого игрока по " + NUM_ATTEMPTS + " попыток");
        init();
        Scanner in = new Scanner(System.in);
        outer:
        for (int i = 0; i < NUM_ATTEMPTS; i++) {
            for (Player value : player) {
                if(isGuessed(value, in)) break outer;
            }
        }
        for (Player value : player) {
            printNums(value);
        }
        System.out.println();
    }

    private void init() {
        Random random = new Random();
        targetNum = random.nextInt(100) + 1;
        for (Player value : player) {
            value.clearAttempts();
        }
        System.out.println();
    }

    private boolean isGuessed(Player player, Scanner in) {
        String name = player.getName();
        System.out.print(name + ", введите предполагаемое число в интервале (0, 100]: ");
        while(!player.addNum(in.nextInt())) {
        }
        if(compareNums(player.getNum())) {
            System.out.println("\n" + name + " угадал(а) число " + targetNum + " с " +
                    player.getNumAttempts() + " попытки");
            player.addNumWonGames();
            return true;
        }
        if(player.getNumAttempts() == NUM_ATTEMPTS) {
            System.out.println("У " + name + " закончились попытки");
        }
        return false;
    }

    private boolean compareNums(int num) {
        if(num != targetNum) {
            System.out.println("Число " + num + (num < targetNum ? " меньше" : " больше") +
                    " того, что загадал компьютер");
            return false;
        } else {
            return true;
        }
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
