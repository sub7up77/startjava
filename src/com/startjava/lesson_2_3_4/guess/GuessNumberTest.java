package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите имя первого игрока: ");
        Player player1 = new Player(in.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(in.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            game.launch();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = in.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}