package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final int NUM_PLAYERS = 3;

    public static void main(String[] args) {

        Player[] players = new Player[NUM_PLAYERS];
        addPlayers(players);
        GuessNumber game = new GuessNumber(players);
        game.launch();
    }

    private static void addPlayers(Player[] players) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < players.length; i++) {
            System.out.print("\nВведите имя " + (i + 1) + "-го игрока: ");
            players[i] = new Player(in.nextLine());
        }
    }
}