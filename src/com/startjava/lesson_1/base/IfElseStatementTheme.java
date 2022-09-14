package com.startjava.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");

        int age = 99;
        boolean isMan = false;
        double height = 1.88;

        System.out.println("\nВозраст " + (age > 20 ? "" : "не ") + "старше двадцати лет.");
        if(!isMan) System.out.println("Она - женщина.");
        System.out.println("Рост " + (height < 1.80 ? "" : "не ") + "ниже 1.80.");
            
        char firstCharName = "Margo".charAt(0);

        if(firstCharName == 'M' || firstCharName == 'I') {
            System.out.println("Имя начинается с " + firstCharName + '.');
        } else {
            System.out.println("Имя не начинается с M или I.");
        }

        System.out.println("\n2. Поиск max и min числа");

        int num1 = 9_784_563;
        int num2 = 9_847_564;

        if(num1 > num2) {
            System.out.println("\nmax = " + num1 + ", min = " + num2 + ".");
        } else {
            System.out.println("\nmax = " + num2 + ", min = " + num1 + ".");
        }

        System.out.println("\n3. Работа с числом");

        int num = -9_870_978;

        if(num == 0) {
            System.out.println("\nЧисло = 0");
        } else {
            System.out.println("\nЧисло " + num + " " + (num % 2 == 0 ? "" : "не") + "четное и " +
                    (num < 0 ? "отрицательное" : "положительное") + ".");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 981;
        num2 = 181;

        int countDigits = 1;

        System.out.println("\nИсходные числа " + num1 + " и " + num2 + ".");
        while (num1 > 0) {
            if(num1 % 10 == num2 % 10) System.out.println("Одинаковая цифра " +
                    num1 % 10 + " в разряде " + countDigits++ + ".");
            num1 /= 10;
            num2 /= 10;
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");

        char symb = '\u0057';

        if(symb >= 'a' && symb <= 'z') {
            System.out.println(symb + " это маленькая буква.");
        } else if(symb >= 'A' && symb <= 'Z') {
            System.out.println(symb + " это большая буква.");
        } else if(symb >= '0' && symb <= '9') {
            System.out.println(symb + " это число.");
        } else {
            System.out.println(symb + " это не буква и не число.");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        
        int depositSum = 300_000;
        int interestSum;

        if(depositSum < 100_000) {
            interestSum = depositSum * 5 / 100;
        } else if(depositSum < 300_000) {
            interestSum = depositSum * 7 / 100;
        } else {
            interestSum = depositSum * 10 / 100;
        }
        System.out.println("\nСумма вклада " + depositSum + ", начисленный процент " + interestSum +
                ", итоговая сумма с процентом " + (depositSum + interestSum) + ".");

        System.out.println("\n7. Определение оценки по предметам");

        int histScore = 59;
        int progScore = 91;
        int histGrade;
        int progGrade;

        if(histScore <= 60) {
            histGrade = 2;
        } else if(histScore <= 73) {
            histGrade = 3;
        } else if(histScore <= 91) {
            histGrade = 4;
        } else {
            histGrade = 5;
        }
        if(progScore <= 60) {
            progGrade = 2;
        } else if(progScore <= 73) {
            progGrade = 3;
        } else if(progScore <= 91) {
            progGrade = 4;
        } else {
            progGrade = 5;
        }
        System.out.println("\n" + histGrade + " по истории");
        System.out.println(progGrade + " по программированию");
        System.out.printf("%1.1f - средний балл по предметам", (histGrade + progGrade) / 2.0);
        System.out.printf("\n%1.1f - средний %% по предметам", (histScore + progScore) / 2.0);

        System.out.println("\n\n8. Расчет прибыли");

        int rentCost = 5000;
        int revenue = 13000;
        int revenueCost = 9000;
        int yearIncome = (revenue - revenueCost - rentCost) * 12;

        System.out.printf("\nПрибыль за год: %,+d руб.", yearIncome);

        System.out.println("\n\n9. Подсчет количества банкнот");

        int takeoffSum = 567;
        int numTenNotes = 5;
        int reqHundredNotes = takeoffSum / 100;
        int reqTenNotes = takeoffSum % 100 / 10;
        int reqOneNotes;
        int sum;

        if(reqTenNotes > numTenNotes) reqTenNotes = numTenNotes;
        reqOneNotes = takeoffSum - reqHundredNotes * 100 - reqTenNotes * 10;
        sum = reqHundredNotes * 100 + reqTenNotes * 10 + reqOneNotes;
        System.out.println("\nНоминал \"сто\" " + reqHundredNotes + " штук.");
        System.out.println("Номинал \"десять\" " + reqTenNotes + " штук.");
        System.out.println("Номинал \"один\" " + reqOneNotes + " штук.");
        System.out.println("Выданная сумма $" + sum + ".");
    }
}
