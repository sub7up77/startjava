package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива\n");
        int[] intArr = {5, 3, 7, 4, 6, 2, 1, 7, 5};
        printArr(intArr, 10);
        int len = intArr.length - 1;
        for (int i = 0; i <= len; i++, len--) {
            int tmp = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] = tmp;
        }
        System.out.println();
        printArr(intArr, 10);

        System.out.println("\n\n2. Вывод произведения элементов массива\n");
        intArr = new int[10];
        int prod = 1;
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            intArr[i] = i;
            if(i != 0 && i != len - 1) {
                prod *= intArr[i];
                System.out.print(intArr[i] + (i != len - 2 ? " * " : " = "));
            }
        }
        System.out.println(prod);
        System.out.println("[0] = " + intArr[0] + " [9] = " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива\n");
        double[] doubleArr = new double[15];
        len = doubleArr.length - 1;
        for (int i = 0; i <= len; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printDoubleArr(doubleArr, 8);
        double midNum = doubleArr[len / 2];
        int zeroCounter = 0;
        for (int i = 0; i <= len; i++) {
            if(doubleArr[i] > midNum) {
                doubleArr[i] = 0;
                zeroCounter++;
            }
        }
        System.out.println("\nИзмененный массив:");
        printDoubleArr(doubleArr, 8);
        System.out.println("\nКоличество обнуленных ячеек: " + zeroCounter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");
        char[] letterArr = new char[26];
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            letterArr[ch - 65] = ch;
        }
        len = letterArr.length;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(letterArr[len - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел\n");
        intArr = new int[30];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            int tmp;
            do {
                tmp = (int) (Math.random() * 40) + 60;
            } while(isExist(tmp, intArr));
            intArr[i] = tmp;
        }
        len = intArr.length;
        for (int i = len - 2; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int tmp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = tmp;
                }
            }
        }
        printArr(intArr, 10);

        System.out.println("\n6. Сдвиг элементов массива");
        String[] srcStrArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int itemsCounter = 0;
        int srcPos1;
        int srcPos2 = 0;
        int destPos = 0;
        for (String str : srcStrArr) {
            if(!str.isBlank()) itemsCounter++;
        }

        String[] destStrArr = new String[itemsCounter];
        len = srcStrArr.length;
        do {
            srcPos1 = srcPos2;
            while(srcPos1 < len && srcStrArr[srcPos1].isBlank()) {
                srcPos1++;
            }
            if(srcPos1 == len) break;
            srcPos2 = srcPos1;
            while(srcPos2 < len && !srcStrArr[srcPos2].isBlank()) {
                srcPos2++;
            }
            srcPos2--;
            System.arraycopy(srcStrArr, srcPos1, destStrArr, destPos, srcPos2 - srcPos1 + 1);
            destPos += srcPos2 - srcPos1 + 1;
            srcPos2 = srcPos2 + 1;
        } while(srcPos2 != len - 1);
        System.out.println("\nИсходный массив:");
        printStrArr(srcStrArr);
        System.out.println("\nИтоговый массив:");
        printStrArr(destStrArr);
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

    private static boolean isExist(int num, int[] intArr) {
        for (int i : intArr) {
            if(i == num) return true;
        }
        return false;
    }

    private static void printStrArr(String[] srcStrArr) {
        System.out.print("{");
        int len = srcStrArr.length;
        for (int i = 0; i < len; i++) {
            System.out.print("\"" + srcStrArr[i] + (i < len - 1 ? "\", " : "\""));
        }
        System.out.print("}");
    }
}