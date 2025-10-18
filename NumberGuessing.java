import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) numbers[i] = i;

        // Shuffle once
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int j = rand.nextInt(10);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        int chances = 10;
        boolean win = false;

        while (chances > 0) {
            System.out.print("Guess 4 numbers (no duplicates): ");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = sc.nextInt();
            }

            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) score++;
            }

            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                win = true;
                break;
            }

            chances--;
            if (chances == 0) {
                System.out.print("The actual number is: ");
                for (int i = 0; i < 4; i++) System.out.print(numbers[i] + " ");
                System.out.println("\nYou Lose.");
                break;
            }

            System.out.println("You have score " + score + " out of 4 numbers. You have " + chances + " chances left.");
        }
    }
}
