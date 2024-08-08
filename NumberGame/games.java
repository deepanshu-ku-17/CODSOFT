package NumberGame;
// random number generator and guess game


import java.util.*;
public class games 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max =100;
        int maxAttempts = 10;
        int rounds= 0;
        int totalScore = 0;
        boolean  playAgain = true;
        while(playAgain) 
        {
            int targetNum = random.nextInt(max-min+1)+min;
            int attempt =0;
            boolean guessCorrectly = false;
            System.out.println("\nRound " + (rounds + 1) + ":");
            System.out.println("Guess the number between " + min + " and " + max + ". You have " + maxAttempts + " attempts.");
            while (attempt < maxAttempts && !guessCorrectly) 
            {
                System.out.println("Enter your guess: ");
                int guess = scanner.nextInt();
                attempt++;
                if (guess < targetNum) 
                {
                    System.out.println("too low!");
                }
                else if(guess > targetNum) 
                {
                    System.out.println("Too High!");
                }
                else
                {
                    guessCorrectly = true;
                System.out.println("Congratulations! you correctly guessed");
                }
            }
            if (guessCorrectly) 
            {
                int score = maxAttempts -  attempt + 1;
                totalScore += score;
                System.out.println("You guessed the number in " + attempt + " attempts. Your score for this round: " + score);
            }
            else
            {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + targetNum + ".");
            }
            rounds++;
            System.out.println("Do you want to play more rounds (yes/no): ");
            scanner.nextLine();
            String playAgainResponse = scanner.nextLine().trim().toLowerCase();
            playAgain=playAgainResponse.equals("yes");
        }
        System.out.println("\nGame over! You played " + rounds + " rounds. Your total score: " + totalScore);
        scanner.close();
    }
}