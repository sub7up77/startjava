public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");

        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd +=counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("\nВ промежутке [-10, 21] сумма четных чисел = " + sumEven +
                ", а нечетных = " + sumOdd +".");

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        int max = num1;

        if (num2 < min) min = num2;
        if (num2 > max) max = num2;
        if (num3 < min) min = num3;
        if (num3 > max) max = num3;
        System.out.print("\nВ интервале (" + min + "; " + max +"): ");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;

        int sum1 = 0;
        int digit;

        System.out.print("\nДля числа " + num1 + " реверсивное число = ");
        do {
            digit = num1 % 10;
            sum1 += digit;
            System.out.print(digit);
            num1 /= 10;
        } while (num1 >0);
        System.out.print(", сумма его цифр = " + sum1 +".");

        System.out.println("\n\n4. Вывод чисел на консоль в несколько строк");
        min = 1;
        max = 24;

        int step = 2;
        int numPerLine = 5;
        int numLines = (max - min) / (numPerLine * step);

        if ((max - min) % (numPerLine * step) != 0) numLines++;
        System.out.print("\nИнтервал (" + min + "; " + max +"), шаг итерации " + step +
                ", в каждой строке " + numPerLine + " чисел:\n\n");

        counter = min;
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <=numPerLine; j++) {
                if (counter < max) {
                    System.out.printf("%2d ", counter);
                } else {
                    System.out.printf("%2d ", 0);
                }
                counter += step;
                if (j == numPerLine) System.out.println();
            }
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        num1 = 3_141_591;
        num2 = num1;
        sum1 = 0;

        while (num2 > 0) {
            digit = num2 % 10;
            if (digit == 1) sum1 += digit;
            num2 /= 10;
        }
        if (sum1 % 2 == 0) {
            System.out.println("\nЧисло " + num1 + " содержит " + sum1 +
                    " (четное) количество единиц.");
        } else {
            System.out.println("\nЧисло " + num1 + " содержит " + sum1 +
                    " (нечетное) количество единиц.");
        }

        System.out.println("\n6.Отображение фигур в консоли\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        numPerLine = 5;
        System.out.println();
        while (numPerLine > 0) {
            counter = numPerLine;
            while (counter >0) {
                System.out.print("#");
                counter -= 1;
            }
            numPerLine -= 1;
            System.out.println();
        }
        System.out.println();
        counter = 1;
        do {
            if (counter % 4 != 0) {
                numPerLine = counter % 4;
            } else {
                numPerLine = 2;
            }
            do {
                System.out.print("$");
            } while (--numPerLine > 0);
            System.out.println();
            counter += 1;
        } while (counter <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("\nDec Char\n");
        for (int i = 0; i <= 127 ; i++) {
            if((i % 2 == 1 && i < 48) || (i > 96 && i % 2 == 0 && i < 123)) 
                    System.out.printf("%3d%5c\n", i, (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num1 = 1_234_321;

        int reverseNum = 0;

        for (int i = 1, j = 1_000_000; i <= 1_000_000; i *=10, j /=10 ) {
            reverseNum += num1 / i % 10 * j;
        }
        if (num1 == reverseNum) {
            System.out.println("\nЧисло " + num1 + " является палиндромом.");
        } else {
            System.out.println("\nЧисло " + num1 + " не является палиндромом.");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num1 = 734_529;
        num2 = 0;
        num3 = 0;
        sum1 = 0;

        int sum2 = 0;

        for (int i = 1, j = 100_000, k =100; i <= 100; i *=10, j /=10, k /=10 ) {
            num2 += num1 / j % 10 * k;
            num3 += num1 / i % 10 * i;
            sum1 += num1 / j % 10;
            sum2 += num1 / i % 10;
        }
        System.out.println("\nСумма цифр " + num2 + " = " + sum1 + ".");
        System.out.println("\nСумма цифр " + num3 + " = " + sum2 + ".");
        if (sum1 == sum2) {
            System.out.println("\nЧисло " + num1 + " является счастливым.");
        } else {
            System.out.println("\nЧисло " + num1 + " не является счастливым.");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

        char c;

        for (int i = 0; i <=9; i++) {
            for (int j = 0; j <=9; j++) {
                if (i == 0 && j == 0) {
                    c = ' ';
                } else if (i == 1 && j == 1) {
                    c = '+';
                } else if (i == 1) {
                    c = '-';
                } else if (j == 1) {
                    c = '|';
                } else if (i == 0) {
                    c = 'j';
                } else if (j == 0) {
                    c = 'i';
                } else {
                    c = 'n';
                }
                if (c == 'j') {
                    System.out.printf("%3d", j);
                } else if (c == 'i'){
                    System.out.printf("%3d", i);
                } else if (c == 'n'){
                    System.out.printf("%3d", i * j);
                } else {
                    System.out.printf("%3c", c);
                }
            }
            System.out.println();
        }
    }
}
