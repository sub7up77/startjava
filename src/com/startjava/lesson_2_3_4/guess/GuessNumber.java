package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch(int num_attempts) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int targetNum = random.nextInt(100) + 1;
        player1.clearAttemps();
        player2.clearAttemps();
        System.out.println();
        for (int i = 0; i < num_attempts; i++) {
            if(isGuessed(player1, in, i, targetNum)) break;
            if(i == num_attempts - 1) System.out.println("У " + player1.getName() + " закончились попытки");
            if(isGuessed(player2, in, i, targetNum)) break;
            if(i == num_attempts - 1) System.out.println("У " + player2.getName() + " закончились попытки");
        }
        System.out.println();
        player1.printAttemps();
        System.out.println();
        player2.printAttemps();
    }

    private boolean compareNums(int num, int targetNum) {
        if(num != targetNum) {
            System.out.println("Число " + num + (num < targetNum ? " меньше" : " больше") +
                    " того, что загадал компьютер");
            return false;
        }
        return true;
    }

    private boolean isGuessed(Player player, Scanner in, int pos, int targetNum) {
        System.out.print(player.getName() + ", введите предполагаемое число в интервале (0,100]: ");
        player.setNum(in.nextInt(), pos);
        if(compareNums(player.getNum(pos), targetNum)) {
            System.out.println("\n" + player.getName() + " угадал число " + targetNum + " с " + (pos + 1) + " попытки");
            return true;
        }
        return false;
    }
}
