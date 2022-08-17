import java.util.Random;

public class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("\n2. Игра \"Угадай число\"\n");

        int targetNum = 50;
        int guessedNum;
        Random generator = new Random();

        do {
            guessedNum = generator.nextInt(100) + 1;
            if(guessedNum < targetNum) {
                System.out.println("число " + guessedNum + " меньше того, что загадал компьютер");
            } else if(guessedNum > targetNum) {
                System.out.println("число " + guessedNum + " больше того, что загадал компьютер");
            }
        } while(targetNum != guessedNum);
        System.out.println(guessedNum + "! Вы победили!");
    }
}
