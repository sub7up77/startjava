package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression;

        do {
            do {
                System.out.print("\nВведите математическое выражение, разделители - пробелы: ");
                expression = in.nextLine();
            } while(!Calculator.isCorrectExpression(expression));
            System.out.println(expression + " = " + Calculator.calculate() + "\n");
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                expression = in.nextLine();
            } while(!expression.equals("yes") && !expression.equals("no"));
        } while(expression.equals("yes"));
    }
}