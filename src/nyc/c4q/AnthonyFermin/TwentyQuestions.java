package nyc.c4q.AnthonyFermin;

import java.util.Scanner;

/* Anthony Fermin
 * A guessing game where the user guesses a number from 1 to 100,000 within 20 tries. The program reports if the
 * guess was too high or too low.
 */

public class TwentyQuestions {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numToGuess = (int) (Math.random() * 100000) + 1; //generates random number from 1 to 100,000
        int numOfGuesses; //stores the number of times the user tried to guess
        int totalChances = 20; //total chances allowed to guess number
        int guess;

        //runs for a maximum of times equal to value of int totalChances
        for(numOfGuesses = 0;numOfGuesses < totalChances; numOfGuesses++){
            System.out.print("You have " + (totalChances - numOfGuesses) + " guesses remaining. Guess a number from 1 to 100,000: ");
            guess = in.nextInt();

            //reports if user guessed correctly, too low or too high. Ends game loop if guesses correctly before reaching totalChances guesses
            if(guess < numToGuess){
                System.out.println("You guessed too low");
            }else if (guess > numToGuess){
                System.out.println("You guessed too high");
            }else{
                System.out.println("You guessed correctly with " + (totalChances - numOfGuesses) + " guesses remaining! Congratulations!");
                break; //ends loop if guessed correctly
            }
            System.out.println();
        }

        //if loop was ended due to more than totalChances guesses, prints out a game over message
        if(numOfGuesses == totalChances){
            System.out.println("You lost!! The correct number was " + numToGuess);
        }

    }

}
