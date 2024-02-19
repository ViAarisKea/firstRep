import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(10) +1;
        int usersGuess = -1;
        int numberOfGuesses = 0;

        System.out.println("Insert a number from 1 to 10");
        while(true){
            if(usersGuess == numberToGuess){
                System.out.printf("You guessed! the number is %d. It took you %d guesses", numberToGuess, numberOfGuesses);
                break;
            }

            usersGuess = scanner.nextInt();
            numberOfGuesses++;
            if(usersGuess > numberToGuess) System.out.println("Try again, I think the number is smaller");
            if(usersGuess < numberToGuess) System.out.println("Try again, I think the number is bigger");
        }
    }
}
