package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression;
        String answer;

        do {
            boolean isCorrectExpression = false;
            do {
                try {
                    System.out.print("\nВведите математическое выражение, разделители - пробелы: ");
                    expression = in.nextLine();
                    System.out.println(expression + " = " + Calculator.calculate(expression) + "\n");
                    isCorrectExpression = true;
                } catch(Exception ex) {
                    System.out.println("Недопустимое математическое выражение");
                }
            } while(!isCorrectExpression);
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = in.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}