package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
private static final int NUM_ATTEMPTS = 10;

    public static void main(String[] args) {
        System.out.println("\nУ каждого игрока по " + NUM_ATTEMPTS + " попыток");
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите имя первого игрока: ");
        Player player1 = new Player(in.nextLine(), NUM_ATTEMPTS);
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(in.nextLine(), NUM_ATTEMPTS);
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            game.launch(NUM_ATTEMPTS);
            do {
                System.out.print("\n\nХотите продолжить игру? [yes/no]: ");
                answer = in.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}