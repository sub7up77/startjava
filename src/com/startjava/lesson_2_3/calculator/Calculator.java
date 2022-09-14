package com.startjava.lesson_2_3.calculator;

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
                if(num1 == 0) {
                    return 0;
                }
                int result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                return result;
            case '%':
                return num1 % num2;
            default:
                System.out.println("Неверный знак математической операции");
                return 0;
        }
    }
}