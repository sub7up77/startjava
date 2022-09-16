package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;

        do {
            System.out.print("\nВведите первое число: ");
            int num1 = in.nextInt();
            System.out.print("Введите знак математической операции: ");
            char sign = in.next().charAt(0);
            System.out.print("Введите второе число: ");
            int num2 = in.nextInt();
            Calculator calculator = new Calculator(num1, sign, num2);
            System.out.println(num1 + " " + sign + " " + num2 + " = " +
                    calculator.calculate() + "\n");
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = in.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}