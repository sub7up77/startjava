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
                sumOdd += counter;
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
        int num = 1234;
        int sumDigits = 0;

        System.out.print("\nДля числа " + num + " реверсивное число = ");
        do {
            int digit = num % 10;
            sumDigits += digit;
            System.out.print(digit);
            num /= 10;
        } while (num > 0);
        System.out.print(", сумма его цифр = " + sumDigits +".");

        System.out.println("\n\n4. Вывод чисел на консоль в несколько строк");
        num1 = 1;
        num2 = 24;

        int step = 2;
        int numPerLine = 5;
        int numLines = (num2 - num1) / (numPerLine * step);

        if ((num2 - num1) % (numPerLine * step) != 0) numLines++;
        System.out.print("\nИнтервал (" + num1 + "; " + num2 +"), шаг итерации " + step +
                ", в каждой строке " + numPerLine + " чисел:\n\n");
        counter = 1;
        for (int i = num1; i < num1 + numLines * numPerLine * step; i +=step, counter++) {
            if (i < num2) {
                System.out.printf("%2d ", i);
            } else {
                System.out.printf("%2d ", 0);
            }
            if (counter % numPerLine == 0) System.out.println();
        }

        System.out.println("\n5. Проверка количества единиц на четность");

        int srcNum = 3_141_591;
        int copySrcNum = srcNum;
        int countOnes = 0;

        while (copySrcNum > 0) {
            if (copySrcNum % 10 == 1) countOnes++;
            copySrcNum /= 10;
        }
        if (countOnes % 2 == 0) {
            System.out.println("\nЧисло " + srcNum + " содержит " + countOnes +
                    " (четное) количество единиц.");
        } else {
            System.out.println("\nЧисло " + srcNum + " содержит " + countOnes +
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
            while (counter > 0) {
                System.out.print("#");
                counter--;
            }
            numPerLine--;
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
            counter++;
        } while (counter <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("\nDec Char\n");
        for (int i = 0; i <= 127 ; i++) {
            if((i % 2 == 1 && i < 48) || (i > 96 && i % 2 == 0 && i < 123)) 
                    System.out.printf("%3d%5c\n", i, (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1_234_321;
        copySrcNum = srcNum;

        int reverseNum = 0;
        int srcNumDigits = 1;
        
        while (copySrcNum > 0) {
            srcNumDigits *= 10;
            copySrcNum /= 10;
        }
        copySrcNum = srcNum;
        while (copySrcNum > 0) {
            reverseNum += copySrcNum % 10 * srcNumDigits / 10;
            copySrcNum /= 10;
            srcNumDigits /= 10;
        }
        if (srcNum == reverseNum) {
            System.out.println("\nЧисло " + srcNum + " является палиндромом.");
        } else {
            System.out.println("\nЧисло " + srcNum + " не является палиндромом.");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 529_344;
        copySrcNum = srcNum;
        srcNumDigits = 1;

        int cmpDigits = 3;
        int cmpFactor = 1;
        int tgtNum1 = 0;
        int tgtNum2 = 0;
        int tgtSumDigits1 = 0;
        int tgtSumDigits2 = 0;

        for (int i = 1; i <= cmpDigits; i++, cmpFactor *= 10);
        while (copySrcNum > 0) {
            srcNumDigits *= 10;
            copySrcNum /= 10;
        }
        tgtNum1 = srcNum / (srcNumDigits / cmpFactor);
        tgtNum2 = srcNum % cmpFactor;
        do {
            cmpFactor /= 10;
            tgtSumDigits1 += tgtNum1 / cmpFactor % 10;
            tgtSumDigits2 += tgtNum2 / cmpFactor % 10;
        } while (cmpFactor > 1);
        System.out.println("\nСумма цифр " + tgtNum1 + " = " + tgtSumDigits1 + ".");
        System.out.println("\nСумма цифр " + tgtNum2 + " = " + tgtSumDigits2 + ".");
        if (tgtSumDigits1 == tgtSumDigits2) {
            System.out.println("\nЧисло " + srcNum + " является счастливым.");
        } else {
            System.out.println("\nЧисло " + srcNum + " не является счастливым.");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        char c;

        System.out.printf("\n\n%3c%3c%3c%3c%3c%3c%3c%3c%3c%3c", ' ', '|', '2', '3', '4', '5', '6',
                '7', '8', '9');
        System.out.printf("\n%3c%3c%3c%3c%3c%3c%3c%3c%3c%3c\n", '-', '+', '-', '-', '-', '-', '-',
                '-', '-', '-');
        for (int i = 2; i <= 9; i++) {
            for (int j = 0; j <=9; j++) {
                if (j == 0) {
                    System.out.printf("%3d", i);;
                } else if (j == 1) {
                    System.out.printf("%3c", '|');;
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            System.out.println();
        }
    }
}