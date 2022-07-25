public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Создание переменных и вывод их значений на консоль");

        byte cpuNum = 1;
        short physMemAvl = 1964;
        int physMemTot = 7874;
        long virtMemMax = 16066;
        float osVer = 10.0F;
        double cpuFreq = 2.1E+9;
        char cpuVendor = 'A';
        boolean osIsWin = true;

        System.out.println("\nЧисло процессоров: " + cpuNum + "\nФизической памяти доступно: " +
                physMemAvl + " MB" + "\nФизической памяти всего: " + physMemTot + " MB" +
                "\nМаксимальное количество виртуальной памяти: " + virtMemMax + " MB" +
                "\nВерсия ОС: " + osVer + "\nЧастота процессора: " + cpuFreq + " Hz" +
                "\nПроизводитель процессора: " + cpuVendor + "\nWindows: " + osIsWin);

        System.out.println("\n2. Расчет стоимости товара со скидкой");

        int xPrice = 100;
        int yPrice = 200;
        byte percent = 11;
        int discountPrice = (xPrice + yPrice) * percent / 100;

        System.out.println("\nСумма скидки: " + discountPrice + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + (xPrice + yPrice -
                discountPrice) + " руб.");

        System.out.println("\n3. Вывод на консоль слова JAVA\n");

        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");

        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println("\nТип: максимальное, инкремент, декремент");
        System.out.println("Byte: " + maxByte + " " + ++maxByte + " " + --maxByte);
        System.out.println("Short: " + maxShort + " " + ++maxShort + " " + --maxShort);
        System.out.println("Int: " + maxInt + " " + ++maxInt + " " + --maxInt);
        System.out.println("Long: " + maxLong + " " + ++maxLong + " " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных");

        int i = 1;
        int j = 2;
        int k;

        System.out.print("\nс помощью третьей переменной: начальные значения " + i +" и " + j);
        k = j;
        j = i;
        i = k;
        System.out.println(", новые значения " + i + " и " + j);
        System.out.print("с помощью арифметических операций: начальные значения " + i + " и " + j);
        i += j;
        j = i - j;
        i -= j;
        System.out.println(", новые значения " + i + " и " + j);
        System.out.print("с помощью побитовой операции ^: начальные значения " + i + " и " + j);
        j ^= i;
        i ^= j;
        j ^= i;
        System.out.println(", новые значения " + i +" и " + j);

        System.out.println("\n6. Вывод символов и их кодов");

        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;

        System.out.println("\n" + "код " + (byte) ch1 + " символ" + " " + ch1);
        System.out.println("код " + (byte) ch2 + " символ" + " " + ch2);
        System.out.println("код " + (byte) ch3 + " символ" + " " + ch3);
        System.out.println("код " + (byte) ch4 + " символ" + " " + ch4);
        System.out.println("код " + (byte) ch5 + " символ" + " " + ch5);

        System.out.println("\n7. Произведение и сумма цифр числа");

        int srcNum = 345;
        int srcDigit1 = srcNum / 100;
        int srcDigit2 = srcNum / 10 % 10;
        int srcDigit3= srcNum % 10;
        System.out.print("\nПроизведение цифр числа " + srcNum + " = ");
        System.out.println(srcDigit1 * srcDigit2 * srcDigit3);
        System.out.print("Сумма цифр числа " + srcNum + " = ");
        System.out.println(srcDigit1 + srcDigit2 + srcDigit3);

        System.out.println("\n8. Отображение количества сотен, десятков и единиц числа");

        srcNum = 123;
        srcDigit1 = srcNum / 100;
        srcDigit2 = srcNum / 10 % 10;
        srcDigit3= srcNum % 10;
        System.out.println("\nЧисло " + srcNum + " содержит:");
        System.out.println(srcDigit1 + " сотен");
        System.out.println(srcDigit2 + " десятков");
        System.out.println(srcDigit3 + " единиц");

        System.out.println("\n9. Вывод на консоль ASCII-арт Дюка\n");

        char ch0 = ' ';
        ch1 = '_';
        ch2 = '/';
        ch3 = '\\';
        ch4 = '(';
        ch5 = ')';
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", ch0, ch0, ch0, ch0, ch2, ch3, ch0, ch0, ch0, ch0);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", ch0, ch0, ch0, ch2, ch0, ch0, ch3, ch0, ch0, ch0);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", ch0, ch0, ch2, ch1, ch4, ch0, ch5, ch3, ch0, ch0);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", ch0, ch2, ch0, ch0, ch0, ch0, ch0, ch0, ch3, ch0);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", ch2, ch1, ch1, ch1, ch1, ch2, ch3, ch1, ch1, ch3);

        System.out.println("\n10. Преобразование секунд\n");

        int totalSeconds = 86399;
        System.out.println(totalSeconds + " секунд в формате ЧЧ:ММ:СС " +
                totalSeconds / 3600 + ":" + totalSeconds % 3600 / 60 + ":" + totalSeconds % 60);
    }
}
