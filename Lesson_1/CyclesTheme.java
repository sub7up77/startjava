public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");

        int evenSum = 0;
        int oddSum = 0;
        int i = -10;

        do {
            if( i%2 == 0) {
                evenSum += i;
            } else {
                oddSum +=i;
            }
            i++;
        } while (i <= 21);
        System.out.println("\nВ промежутке [-10, 21] сумма четных чисел = " + evenSum +
                ", а нечетных = " + oddSum +".");

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        i = 10;

        int j = 5;
        int k = -1;
        int minVal = i;
        int maxVal = i;
        
        if (j < minVal) minVal = j;
        if (j > maxVal) maxVal = j;
        if (k < minVal) minVal = k;
        if (k > maxVal) maxVal = k;
        System.out.print("\nВ интервале (" + minVal + "; " + maxVal +"): ");
        for (i = maxVal - 1; i > minVal; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        
        int num = 1234;
        int sum = 0;

        i = 1;
        System.out.print("\nДля числа " + num + " реверсивное число = ");
        do {
            j = num / i % 10;
            sum += j;
            System.out.print(j);
            i *= 10;
        } while (i <= 1000);
        System.out.print(", сумма его цифр = " + sum +".");

        System.out.println("\n\n4. Вывод чисел на консоль в несколько строк");
        minVal = 1;
        maxVal = 24;

        int addVal;
        int step = 2;
        int numPerLine = 5;
        int surplus = (maxVal - minVal) % step;

        if (surplus != 0) {
            num = (maxVal - minVal) / step + 1;
        } else {
            num = (maxVal - minVal) / step;
        }
        if (num % numPerLine == 0) {
            addVal = maxVal;
        } else {
            addVal = minVal + (num / numPerLine + 1) * numPerLine * step;
        }
        j = 0;
        System.out.print("\nИнтервал (" + minVal + "; " + maxVal +"), шаг итерации " + step +
                ", в каждой строке " + numPerLine + " чисел:\n\n");
        for (i = minVal; i < addVal; i +=step) {
            if (i < maxVal) {
                System.out.printf("%2d ", i);
            } else {
                System.out.printf("%2d ", 0);
            }
            j++;
            if (j % numPerLine == 0) System.out.println();
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        num = 3_141_591;
        sum = 0;
        i = 1;
        while (i <= 1_000_000) {
            j = num / i % 10;
            if (j == 1) sum += j;
            i *= 10;
        }
        if (sum % 2 == 0) {
            System.out.println("\nЧисло " + num + " содержит " + sum +
                    " (четное) количество единиц.");
        } else {
            System.out.println("\nЧисло " + num + " содержит " + sum +
                    " (нечетное) количество единиц.");
        }

        System.out.println("\n6.Отображение фигур в консоли\n");
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        i = 5;
        System.out.println();
        while (i > 0) {
            j = i;
            while (j >0) {
                System.out.print("#");
                j -= 1;
            }
            i -= 1;
            System.out.println();
        }
        System.out.println();
        i = 1;
        do {
            if (i % 4 != 0) {
                j = i % 4;
            } else {
                j = 2;
            }
            do {
                System.out.print("$");
            } while (--j > 0);
            System.out.println();
            i += 1;
        } while (i <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("\nDec Char\n");
        for (i = 0; i <= 127 ; i++) {
            if((i % 2 == 1 && i < 48) || (i > 96 && i % 2 == 0 && i < 123)) 
                    System.out.printf("%3d%5c\n", i, (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1_234_321;

        int reverseNum = 0;

        for (i = 1, j = 1_000_000; i <= 1_000_000; i *=10, j /=10 ) {
            reverseNum += num / i % 10 * j;
        }
        if (num == reverseNum) {
            System.out.println("\nЧисло " + num + " является палиндромом.");
        } else {
            System.out.println("\nЧисло " + num + " не является палиндромом.");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 734_529;
        
        int num1 = 0;
        int num2 = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (i = 1, j = 100_000, k =100; i <= 100; i *=10, j /=10, k /=10 ) {
            num1 += num / j % 10 * k;
            num2 += num / i % 10 * i;
            sum1 += num / j % 10;
            sum2 += num / i % 10;
        }
        System.out.println("\nСумма цифр " + num1 + " = " + sum1 + ".");
        System.out.println("\nСумма цифр " + num2 + " = " + sum2 + ".");
        if (sum1 == sum2) {
            System.out.println("\nЧисло " + num + " является счастливым.");
        } else {
            System.out.println("\nЧисло " + num + " не является счастливым.");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

        char c;

        for (i = 0; i <=9; i++) {
            for (j = 0; j <=9; j++) {
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
