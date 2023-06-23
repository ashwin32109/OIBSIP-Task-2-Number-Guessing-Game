import java.util.Scanner;
import java.util.Random;
class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String play = "yes";

        while(play.equals("yes"))
        {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;
            //
            while(guess != randNum)
            {
                System.out.println("Guess number between 1 to 100:");
                guess = reader.nextInt();
                tries++;

                if(guess == randNum)
                {
                    System.out.println("You guessed the number.");
                    System.out.println("You took only " + tries + " guess.");
                    System.out.println("Start playing again: Yes or No");
                    play = reader.next().toLowerCase();
                } else if (guess > randNum)
                {
                    System.out.println("You guess too high, try again");
                }
                else
                {
                    System.out.println("You guess too low, try again");
                }
            }
        }
        reader.close();
    }
}