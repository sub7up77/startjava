package com.startjava.lesson_2_3.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int targetNum = random.nextInt(100) + 1;
        do {
            System.out.print(player1.getName() +
                    ", введите предполагаемое число в интервале (0,100]: ");
            player1.setNumber(in.nextInt());
            if (compareNums(player1.getNumber(), targetNum)) break;
            System.out.print(player2.getName() +
                    ", введите предполагаемое число в интервале (0,100]: ");
            player2.setNumber(in.nextInt());
        } while(!compareNums(player2.getNumber(), targetNum));
    }

    private boolean compareNums(int number, int targetNum) {
        if(number != targetNum) {
            System.out.println("Число " + number + (number < targetNum ? " меньше" : " больше") +
                    " того, что загадал компьютер");
            return false;
        }
        System.out.println("Вы угадали!");
        return true;
    }
}
