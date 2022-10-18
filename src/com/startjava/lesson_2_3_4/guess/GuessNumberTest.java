package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final int NUM_PLAYERS = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers(in));
        String answer;

        do {
            game.launch();
            do {
                System.out.print("\nХотите продолжить игру? [yes/no]: ");
                answer = in.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }

    private static Player[] createPlayers(Scanner in) {
        Player[] players = new Player[NUM_PLAYERS];

        for (int i = 0; i < players.length; i++) {
            System.out.print("\nВведите имя " + (i + 1) + "-го игрока: ");
            players[i] = new Player(in.nextLine());
        }
        return players;
    }
}