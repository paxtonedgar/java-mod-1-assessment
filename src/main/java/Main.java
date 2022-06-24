import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessingNumberGame();    
    }

    public static void guessingNumberGame(){

        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(10* Math.random());
        
        List<String> game_diff = Arrays.asList("Easy: guess a number - program will tell you if it was higher or equal (you win) or lower (computer wins) than the program's number.", 
                            "Medium: guess a number - program will tell you if it was strictly higher (you win) or lower or equal (computer wins) than the program's number.",
                            "Hard: guess a number - program will tell you if it was equal (you win) or not (you lose) to the program's number." );
            

        System.out.println(
            "A number is chosen between 1 to 10. "
            + "Guess the number "
            + "First, Select your difficulty:");
        System.out.println();
        game_diff.forEach(System.out::println);
        String diff = sc.nextLine();
        System.out.println();
        diff = diff.trim().toLowerCase().toString();

        if(diff.matches("^e(a)?(s)?(y)?$")){
            easygame(number, sc);
        }else if(diff.matches("^m(e)?(d)?(i)?(u)?(m)?$")){
            mediumgame(number, sc);
        }else if(diff.matches("^h(a)?(r)?(d?)$")) {
            hardgame(number, sc);
        }else{
            System.out.println("ERROR: You had one job. Goodbye.");
        }
    }

    private static void easygame(int number, Scanner sc){
        System.out.println("ENTERING EASY MODE");
        System.out.println("Guess the number:");
        int guess = sc.nextInt();
        System.out.println();

        if (number == guess) {
            System.out.println("Congratulations! You guessed the number.");
            System.out.println("WINNER: Player 1");
            System.out.println("The number was " + number);
        }else if (number > guess) {
           System.out.println("Congratulations! The number is greater than " + guess);
           System.out.println("WINNER: Player 1");
           System.out.println("The number was " + number);
        }else if (number < guess) {
            System.out.println("Sucks to suck! The number is less than " + guess);
            System.out.println( "WINNER: CPU");
            System.out.println("The number was " + number);
        }
    }
    
    private static void mediumgame(int number, Scanner sc){
        System.out.println("ENTERING MEDIUM MODE");
        System.out.println("Guess the number:");
        int guess = sc.nextInt();
        System.out.println();

       if (number > guess) {
            System.out.println("Congratulations! The number is greater than " + guess);
            System.out.println(" WINNER: Player 1");
            System.out.println("The number was " + number);

        }else if (number < guess) {
            System.out.println("Sucks to suck! The number is less than " + guess);
            System.out.println("WINNER: CPU");
            System.out.println("The number was " + number);
        }
    }

    private static void hardgame(int number, Scanner sc){
        System.out.println("ENTERING HARD MODE");
        System.out.println("Guess the number:");
        int guess = sc.nextInt();
        System.out.println();
        
        if (number == guess) {
            
            System.out.println("Congratulations! You guessed the number.");
            System.out.println( " WINNER: Player 1");
            System.out.println("The number was " + number);
        }else if (number < guess || number > guess) {
            System.out.println("Sucks to suck! The number is less than " + guess);
            System.out.println("WINNER: CPU");
            System.out.println("The number was " + number);
        }
    }
}