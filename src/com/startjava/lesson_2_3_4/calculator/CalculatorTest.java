package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;

        do {
            System.out.print("\nВведите математическое выражение: ");
            String[] words = in.nextLine().split(" ");
            int num1 = parseInt(words[0]);
            char sign = words[1].charAt(0);
            int num2 = parseInt(words[2]);
            Calculator calculator = new Calculator(num1, sign, num2);
            System.out.println(num1 + " " + sign + " " + num2 + " = " +
                    calculator.calculate() + "\n");
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = in.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}