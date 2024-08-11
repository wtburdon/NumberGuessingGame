import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Welcome to the number guessing game!");
                System.out.println("\nWould you like to play? (Y/N)");
                char answer = sc.nextLine().charAt(0);
                answer = Character.toUpperCase(answer);

                if (answer == 'Y') {
                    NumberGame game = new NumberGame(100);
                    game.GameStart();
                    System.exit(0);
                }else if (answer == 'N') {
                    System.out.println("okay...");
                    sc.close();
                    System.exit(0);
                }else{
                    System.out.println("Please enter a Y or N");
                }
            }catch(Exception e){
                System.out.println("""
                        Something went wrong\n""");
            }
        }
    }
}
