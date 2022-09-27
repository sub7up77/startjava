package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива\n");
        int[] intArr = {5, 3, 7, 4, 6, 2, 1, 7, 5};
        printArr(intArr, 10);
        int len = intArr.length;
        for (int i = 0 ; i < len; i++, len--) {
            int num = intArr[i];
            intArr[i] = intArr[len-1];
            intArr[len-1] = num;
        }
        System.out.println();
        printArr(intArr, 10);

        System.out.println("\n\n2. Вывод произведения элементов массива\n");
        intArr = new int[10];
        int multy = 1;
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            intArr[i] = i;
            if(i != 0 && i != len - 1) {
                multy *= intArr[i];
                System.out.print(intArr[i] + (i != len - 2 ? " * " : " = "));
            }
        }
        System.out.println(multy);
        System.out.println("[0] = " + intArr[0] + " [9] = " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива\n");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printDoubleArr(doubleArr, 8);
        double midNum = doubleArr[(len - 1) / 2];
        int zCounter = 0;
        for (int i = 0; i <= len - 1; i++) {
            if(doubleArr[i] > midNum) {
                doubleArr[i] = 0;
                zCounter++;
            }
        }
        System.out.println("\nИзмененный массив:");
        printDoubleArr(doubleArr, 8);
        System.out.println("\nКоличество обнуленных ячеек: " + zCounter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");
        char[] charArr = new char[26];
        for (char c = 'A'; c <= 'Z'; c++) {
            charArr[c-65] = c;
        }
        len = charArr.length;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(charArr[len - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел\n");
        intArr = new int[30];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            int num;
            do {
                num = (int) (Math.random() * 40) + 60;
            } while(isInArray(num, intArr));
            intArr[i] = num;
        }
        len = intArr.length;
        for (int i = len - 2; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int num = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = num;
                }
            }
        }
        printArr(intArr, 10);

        System.out.println("\n6. Сдвиг элементов массива");
        String[] strArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int iCounter = 0;
        int srcFirst;
        int srcLast = 0;
        int tgtFirst = 0;
        for (String str1 : strArr) {
            if(!str1.isBlank()) iCounter++;
        }
        String[] strTgtArr = new String[iCounter];

        len = strArr.length;
        do {
            srcFirst = srcLast;
            while(srcFirst < len && strArr[srcFirst].isBlank()) {
                srcFirst++;
            }
            if(srcFirst == len) break;
            srcLast = srcFirst;
            while(srcLast < len && !strArr[srcLast].isBlank()) {
                srcLast++;
            }
            srcLast--;
            System.arraycopy(strArr, srcFirst, strTgtArr, tgtFirst, srcLast - srcFirst + 1);
            tgtFirst += srcLast - srcFirst + 1;
            srcLast = srcLast + 1;
        } while(srcLast != len - 1);
        System.out.println("\nИсходный массив:");
        printStrArr(strArr);
        System.out.println("\nИтоговый массив:");
        printStrArr(strTgtArr);
    }

    private static void printArr(int[] intArr, int numsPerLine) {
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + ((i+1) % numsPerLine == 0 ? "\n" : " "));
        }
    }

    private static void printDoubleArr(double[] doubleArr, int numsPerLine) {
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.printf("%5.3f%s", doubleArr[i], ((i+1) % numsPerLine == 0 ? "\n" : " "));
        }
    }

    private static boolean isInArray(int num, int[] intArr) {
        for (int i : intArr) {
            if(i == num) return true;
        }
        return false;
    }

    private static void printStrArr(String[] strArr) {
        System.out.print("{");
        int len = strArr.length;
        for (int i = 0; i < len; i++) {
            System.out.print("\"" + strArr[i] + (i < len - 1 ? "\", " : "\""));
        }
        System.out.print("}");
    }
}