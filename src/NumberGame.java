import java.util.Scanner;
import java.math.*;

public class NumberGame {
    private int LowerBound = 0;
    private int UpperBound; //top number threshold
    private int TimeToGuess;
    private int guess;
    private int Wnumber;

    public NumberGame(){
        UpperBound = 10;
        Wnumber = (int) (UpperBound * (Math.random())); //creates the random number to guess
    }
    public NumberGame(int D) {
        UpperBound = D;
        Wnumber = (int) (UpperBound * (Math.random())); //creates the random number to guess
    }

    public void GameStart(){
        while(CheckGuess() != true){
            System.out.println("test");
        }

    }

    private boolean CheckGuess(){ // checks guess returns if correct
        Scanner sc = new Scanner(System.in);

        System.out.println(String.format("Pick a number between 0 and %s: ", UpperBound));
        guess = sc.nextInt();
        TimeToGuess++;
        sc.close();

        if (guess == Wnumber){
            return true;
        }else if (guess > Wnumber){
            UpperBound = guess; //Closes bound into correct number
            System.out.println("Your guess is too high!");
            return false;
        }else{
            LowerBound = guess; //Closes bound into the correct number
            System.out.println("Your guess is too low!");
            return false;
        }

    }

}
