import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculatorOne = new Calculator();
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        char sign;
        String answer;

        do {
            do {
                System.out.print("\nВведите первое число: ");
                num1 = in.nextInt();
                System.out.print("Введите знак математической операции: ");
                sign = in.next().charAt(0);
                System.out.print("Введите второе число: ");
                num2 = in.nextInt();
            } while(!calculatorOne.setParams(num1, sign, num2));
            System.out.println(num1 + " " + sign + " " + num2 + " = " + calculatorOne.getResult() +
                    "\n");
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = in.next();
            } while(!(answer.equals("yes") || answer.equals("no")));
        } while(answer.equals("yes"));
    }
}