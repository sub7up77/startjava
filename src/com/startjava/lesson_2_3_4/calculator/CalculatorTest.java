package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class CalculatorTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input;

        do {
            String[] str;
            do {
                System.out.print("\nВведите математическое выражение, разделители - пробелы: ");
                input = in.nextLine();
                str = input.split(" ");
            } while(!isPermitted(str));
            System.out.println(input + " = " + Calculator.calculate(str) + "\n");
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                input = in.nextLine();
            } while(!input.equals("yes") && !input.equals("no"));
        } while(input.equals("yes"));
    }

    private static int getNum(String str) {
        try {
            int num = parseInt(str);
            if(num <= 0) {
                System.out.println("Операнды должны быть положительными числами");
                return 0;
            } else {
                return num;
            }
        } catch(NumberFormatException ex) {
            System.out.println("Операнд не является числом");
            return 0;
        }
    }

    private static boolean isSign(String str) {
        char[] sign = {'+', '-', '*', '/', '^', '%'};
        for (char ch : sign) {
            if(str.charAt(0) == ch) {
                return true;
            }
        }
        System.out.println("Недопустимый знак математической операции");
        return false;
    }

    private static boolean isPermitted(String[] str) {
        if (str.length != 3 || str[1].equals("") || getNum(str[0]) == 0 || !isSign(str[1]) || getNum(str[2]) == 0) {
            System.out.println("Недопустимое математическое выражение");
            return false;
        } else {
            return true;
        }
    }
}