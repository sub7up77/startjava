package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;
import static java.lang.Integer.parseInt;

public class Calculator {
    private static int num1;
    private static char sign;
    private static int num2;

    private static void setNums(String str1, String str2) {
        num1 = parseInt(str1);
        num2 = parseInt(str2);
    }

    private static void setSign(String str) {
        sign = str.charAt(0);
    }

    public static double calculate(String expression) throws Exception {
        String[] str = expression.split(" ");

        setNums(str[0], str[2]);
        setSign(str[1]);
        return switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (double) num1 / (double) num2;
            case '^' -> pow(num1, num2);
            case '%' -> IEEEremainder(num1, num2);
            default ->  throw new Exception();
        };
    }
}