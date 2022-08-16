import java.util.Random;

public class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("\n2. Игра \"Угадай число\"\n");

        int proposedNum = 50;
        int guessedNum;
        Random generator = new Random();

        do {
            guessedNum = generator.nextInt(100) + 1;
            if (guessedNum < proposedNum) {
                System.out.println("число " + guessedNum + " меньше того, что загадал компьютер");
            } else if (guessedNum > proposedNum) {
                System.out.println("число " + guessedNum + " больше того, что загадал компьютер");
            }
        } while(proposedNum != guessedNum);
        System.out.println(guessedNum + "! Вы победили!");
    }
}
