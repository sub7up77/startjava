import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int targetNum = random.nextInt(100) + 1;
        int guessedNum;
        do {
            System.out.print(this.player1.getName() +
                    ", введите предполагаемое число в интервале (0,100]: ");
            guessedNum = in.nextInt();
            if (!isEqual(guessedNum, targetNum)) {
                System.out.print(this.player2.getName() +
                        ", введите предполагаемое число в интервале (0,100]: ");
                guessedNum = in.nextInt();
                isEqual(guessedNum, targetNum);
            }
        } while(guessedNum != targetNum);
    }

    private boolean isEqual(int num, int targetNum) {
        if(num != targetNum) {
            System.out.println("Число " + num + (num < targetNum ?
                " меньше" : " больше") + " того, что загадал компьютер");
            return false;
        }
        System.out.println("Вы угадали!");
        return true;
    }
}
