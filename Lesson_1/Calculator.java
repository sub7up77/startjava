public class Calculator {

    public static void main(String[] args) {
        System.out.printf("\n1. \"Калькулятор\"\n\n");

        int num1 = 10;
        int num2 = 7;
        char sign = '/';
        double result;

        if((num2 == 0) && (sign == '/' || sign == '%')) {
            System.out.println("Недопустимая операция деления на 0");
        } else {
            if(sign == '+') {
                result = num1 + num2;
            } else if(sign == '-') {
                result = num1 - num2;
            } else if(sign == '*') {
                result = num1 * num2;
            } else if(sign == '/') {
                result = (double) num1 / (double) num2;
            } else if(sign == '^') {
                if(num1 == 0) {
                    result = 0;
                } else if(num2 == 0) {
                    result = 1;
                } else {
                    result = 1;
                    for (int i = 1; i <= num2; i++) {
                        result *= num1;
                    }
                }
            } else if(sign == '%') {
                result = num1 % num2;
            } else {
                result = 0;
            }
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        }
    }
}
