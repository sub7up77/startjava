package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static final int NUM_ATTEMPTS = 10;
    private static final int NUM_ROUNDS = 3;

    private int targetNum;
    private Player[] player;

    public GuessNumber(Player... players) {
        player = players;
    }

    public void launch() {
        shufflePlayers(player);
        for (int i = 1; i <= NUM_ROUNDS; i++) {
            System.out.println("\nРаунд " + i);
            System.out.println("У каждого игрока по " + NUM_ATTEMPTS + " попыток");
            init();
            Scanner in = new Scanner(System.in);
            outer:
            for (int j = 0; j < NUM_ATTEMPTS; j++) {
                for (Player value : player) {
                    if (isGuessed(value, in)) break outer;
                }
            }
            for (Player value : player) {
                printNums(value);
            }
            System.out.println();
        }
        int maxNumWins = 0;
        for (Player value : player ) {
            if(maxNumWins < value.getNumWins()) maxNumWins = value.getNumWins();
        }
        for (Player value : player ) {
            if(maxNumWins == value.getNumWins()) {
                System.out.println("\n" + value.getName() + " - победитель, побед в раундах: " + maxNumWins);
            }
        }
    }

    private static void shufflePlayers(Player... players) {
        Random random = new Random();

        for (int i = players.length - 1; i >= 1; i--) {
            int j = random.nextInt(i + 1);
            if(i != j) {
                String tmp = players[i].getName();
                players[i].setName(players[j].getName());
                players[j].setName(tmp);
            }
        }
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
            player.addNumWins();
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
