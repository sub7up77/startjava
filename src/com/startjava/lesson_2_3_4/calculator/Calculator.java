package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;
import static java.lang.Integer.parseInt;

public class Calculator {

    public static double calculate(String[] str) {

        int num1 = parseInt(str[0]);
        char sign = str[1].charAt(0);
        int num2 = parseInt(str[2]);

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