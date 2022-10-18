package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static final int NUM_ATTEMPTS = 10;
    private static final int NUM_ROUNDS = 3;

    private int targetNum;
    private Player[] players;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void launch() {
        Scanner in = new Scanner(System.in);

        shufflePlayers();
        for (int i = 1; i <= NUM_ROUNDS; i++) {
            System.out.println("\nРаунд " + i);
            System.out.println("У каждого игрока по " + NUM_ATTEMPTS + " попыток");
            initRound();
            startRound(in);
            printNums();
        }
        int maxNumWins = 0;
        for (Player player : players) {
            if(maxNumWins < player.getNumWins()) maxNumWins = player.getNumWins();
        }
        System.out.println();
        for (Player player : players) {
            if(maxNumWins == player.getNumWins()) {
                System.out.println(player.getName() + " - победитель, побед в раундах: " + maxNumWins);
            }
        }
    }

    private void shufflePlayers() {
        Random random = new Random();
        for (int i = players.length - 1; i >= 1; i--) {
            int j = random.nextInt(i + 1);
            if(i != j) {
                Player tmp = players[i];
                players[i] = players[j];
                players[j] = tmp;
            }
        }
    }

    private void initRound() {
        Random random = new Random();
        targetNum = random.nextInt(100) + 1;
        for (Player player : players) {
            player.clearAttempts();
        }
        System.out.println();
    }

    private void startRound(Scanner in) {
        for (int j = 0; j < NUM_ATTEMPTS; j++) {
            for (Player player : players) {
                if (isGuessed(player, in)) return;
            }
        }
    }

    private boolean isGuessed(Player player, Scanner in) {
        String name = player.getName();
        do {
            System.out.print(name + ", введите предполагаемое число в интервале (0, 100]: ");
        } while(!player.addNum(in.nextInt()));
        if(compareNums(player.getNum())) {
            System.out.println("\n" + name + " угадал(а) число " + targetNum + " с " +
                    player.getNumAttempts() + " попытки");
            player.incNumWins();
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

    private void printNums() {
        for (Player player : players) {
            System.out.println();
            if (player.getNums().length != 0) {
                System.out.print(player.getName() + ": ");
                for (int num : player.getNums()) {
                    System.out.printf("%-3d", num);
                }
            }
        }
        System.out.println();
    }
}
