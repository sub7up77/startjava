package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public Calculator(int num1, char sign, int num2) {
        this.num1 = num1;
        this.sign = sign;
        this.num2 = num2;
    }

    public double calculate() {
        if((num2 == 0) && (sign == '/' || sign == '%')) {
            System.out.println("Деление на ноль");
            return 0;
        }
        switch(sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / (double) num2;
            case '^':
                return pow(num1, num2);
            case '%':
                return IEEEremainder(num1, num2);
            default:
                System.out.println("Неверный знак математической операции");
                return 0;
        }
    }
}