package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    private static final int NUM_PLAYERS = 3;
    private static final int NUM_ROUNDS = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player[] players = new Player[NUM_PLAYERS];

        for (int i = 0; i < players.length; i++) {
            System.out.print("\nВведите имя " + (i + 1) + "-го игрока: ");
            players[i] = new Player(in.nextLine());
        }
        shufflePlayers(players);

        GuessNumber game = new GuessNumber(players);
        for (int i = 1; i <= NUM_ROUNDS; i++) {
            game.launch(i);
        }
        int maxWonGames = 0;
        for (Player value : players ) {
            if(maxWonGames < value.getNumWonGames()) maxWonGames = value.getNumWonGames();
        }
        for (Player value : players ) {
            if(maxWonGames == value.getNumWonGames()) {
                System.out.println("\n" + value.getName() + " - победитель, побед в раундах: " + maxWonGames);
            }
        }
    }

    private static void shufflePlayers(Player... players) {
        Random random = new Random();

        for (int i = players.length - 1; i >= 1; i--) {
            int j = random.nextInt(i + 1);
            if(i != j) {
                String str = players[i].getName();
                players[i].setName(players[j].getName());
                players[j].setName(str);
            }
        }
    }
}