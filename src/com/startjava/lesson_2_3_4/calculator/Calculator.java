package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;
import static java.lang.Integer.parseInt;

public class Calculator {
    private static int num1;
    private static char sign;
    private static int num2;

    public static boolean isCorrectExpression(String expression) {
        String[] str = expression.split(" ");

        if (str.length != 3 || str[1].equals("") || !setSign(str[1]) || !setNums(str[0], str[2])) {
            System.out.println("Недопустимое математическое выражение");
            return false;
        } else {
            return true;
        }
    }

    private static boolean setNums(String str1, String str2) {
        try {
            num1 = parseInt(str1);
            num2 = parseInt(str2);
            if(num1 <= 0 || num2 <= 0) {
                System.out.println("Операнды должны быть положительными числами");
                return false;
            } else {
                return true;
            }
        } catch(NumberFormatException ex) {
            System.out.println("Операнд не является числом");
            return false;
        }
    }

    private static boolean setSign(String str) {
        char[] signs = {'+', '-', '*', '/', '^', '%'};

        for (char ch : signs) {
            if(ch == str.charAt(0)) {
                sign = ch;
                return true;
            }
        }
        System.out.println("Недопустимый знак математической операции");
        return false;
    }

    public static double calculate() {
        return switch(sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (double) num1 / (double) num2;
            case '^' -> pow(num1, num2);
            case '%' -> IEEEremainder(num1, num2);
            default -> 0;
        };
    }
}