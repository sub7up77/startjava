import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int targetNum = random.nextInt(100) + 1;
        while(true) {
            System.out.print(player1.getName() +
                    ", введите предполагаемое число в интервале (0,100]: ");
            player1.setNumber(in.nextInt());
            if (!compareNums(player1.getNumber(), targetNum)) {
                System.out.print(player2.getName() +
                        ", введите предполагаемое число в интервале (0,100]: ");
                player2.setNumber(in.nextInt());
                if(compareNums(player2.getNumber(), targetNum)) break;
            } else {
                break;
            }
        }
    }

    private boolean compareNums(int num, int targetNum) {
        if(num != targetNum) {
            System.out.println("Число " + num + (num < targetNum ? " меньше" : " больше") +
                    " того, что загадал компьютер");
            return false;
        }
        System.out.println("Вы угадали!");
        return true;
    }
}
