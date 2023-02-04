import java.util.Random;
import java.util.Scanner;

public class RandomNumGenerator {
    public static void main(String[] args) {
        //    Objective  :   To generate random number from computer
//    Package    :   java.util
//    Method     :   nextInt(limit) : Generate random between 0 o limit

        Scanner input = new Scanner(System.in); // here we are taking input from the user
        Random rndm = new Random();   // for computer's choice we use "Random"
        int ComputerChoice = rndm.nextInt(50);
        System.out.println("Computer Choice : " + ComputerChoice);

//         So now we're gonna modify the code a bit by turning it into
//        Guess the Number
//        So, here basically computer randomly chose and prints a number and then
//        asks the user to guess the number of the given limit. if the user
//        guess the number right we provide a conditional statement.

//        LOOK AT THE CODE FOR MORE CLARITY

        for (int i=1; i<6; i++ ) { //Basically, here we are declaring the number of times a user can guess the number. Here user can guess the number 5 times.
            System.out.print("Guess the between 0 to 50: ");
            int UserChoice = input.nextInt();

            if (UserChoice > ComputerChoice) {
                System.out.println("Your guess is too High");
            }
            else if (UserChoice < ComputerChoice) {
                System.out.println("Your guess is too Low");
            }
            else {
                System.out.println("Woah! You guessed it Right");
                break;
            }
        }
    }
}
