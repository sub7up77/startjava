import java.util.Random;

public class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("\n2. Игра \"Угадай число\"\n");

        int num1 = 50;
        int num2;
        Random generator = new Random();

        do {
            num2 = generator.nextInt(100);
            if (num1 != num2) System.out.println("число " + num2 +
                    (num2 < num1 ? " меньше" : " больше") + " того, что загадал компьютер");
        } while(num1 != num2);
        System.out.println(num2 + "! Вы победили!");
    }
}
