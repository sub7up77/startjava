public class VariablesTheme {

    public static void main(String[] args) {
        byte procNum = 1;
        short physMemAvl = 1964;
        int physMemTot = 7874;
        long virtMemMax = 16066;
        float justFloat = 1234567.89F;
        double justDouble = 1.79769313486231570E+308;
        char procVendor = 'A';
        boolean osIsWin = true;

        System.out.println("\nprocNum = " + procNum + "\nphysMemAvl = " + physMemAvl +
                "\nphysMemTot = " + physMemTot + "\nvirtMemMax = " + virtMemMax +
                "\njustFloat = " + justFloat + "\njustDouble = " + justDouble +
                "\nprocVendor = " + procVendor + "\nosIsWin = " + osIsWin);

        int goodX = 100;
        int goodY = 200;
        byte joinDiscPerc = 11;
        int joinDisc = (goodX + goodY) * joinDiscPerc / 100;

        System.out.println("\njoinDisc = " + joinDisc + " руб.");
        System.out.println("totWithDisc = " + (goodX + goodY - joinDisc) + " руб.");

        System.out.println("");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println("\nByte: " + maxByte + " " + ++maxByte + " " + --maxByte);
        System.out.println("Short: " + maxShort + " " + ++maxShort + " " + --maxShort);
        System.out.println("Int: " + maxInt + " " + ++maxInt + " " + --maxInt);
        System.out.println("Long: " + maxLong + " " + ++maxLong + " " + --maxLong);

        int i = 1;
        int j = 2;
        int k;

        System.out.println("\nthird var, initial values: " + i +" & " + j);
        k = j;
        j = i;
        i = k;
        System.out.println("third var, final values: " + i + " & " + j);
        System.out.println("math ops, initial values: " + i + " & " + j);
        i += j;
        j = i - j;
        i -= j;
        System.out.println("math ops, final values: " + i + " & " + j);
        System.out.println("bit ops, initial values: " + i + " & " + j);
        j ^= i;
        i ^= j;
        j ^= i;
        System.out.println("bit ops, final values: " + i +" & " + j);

        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;
        System.out.println("\n" + (byte) ch1 + " " + ch1);
        System.out.println((byte) ch2 + " " + ch2);
        System.out.println((byte) ch3 + " " + ch3);
        System.out.println((byte) ch4 + " " + ch4);
        System.out.println((byte) ch5 + " " + ch5);

        int n = 345;

        System.out.print("\nПроизведение цифр числа " + n + " = ");
        System.out.println(n / 100 * (n / 10 % 10) * (n % 10));
        System.out.print("Сумма цифр числа " + n + " = ");
        System.out.println(n / 100 + n / 10 % 10 + n % 10);

        n = 123;
        System.out.println("\nЧисло " + n + " содержит:");
        System.out.println(n / 100 + " сотен");
        System.out.println(n / 10 % 10 + " десятков");
        System.out.println(n % 10 + " единиц");

        n = 86399;
        System.out.println("\n" + n / 3600 + ":" + (n - (n / 3600) * 60) % 60 + ":" + n % 60);
    }
}
