import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts = 0;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("Guess Number Between 1 to 100");

        do {

            System.out.print("Enter Your Guess: ");

            guess = sc.nextInt();

            attempts++;

            if(guess > number) {

                System.out.println("Too High!");

            }

            else if(guess < number) {

                System.out.println("Too Low!");

            }

            else {

                System.out.println("Correct Number!");
                System.out.println("Attempts = " + attempts);
            }

        } while(guess != number);
    }
}