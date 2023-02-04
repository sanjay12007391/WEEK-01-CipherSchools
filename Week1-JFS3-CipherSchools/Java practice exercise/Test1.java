import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = input.nextInt();

        if (num>0) {
            System.out.println("Positive");
        }
        else if (num == 0) {
            System.out.println("Neutral");
        }
        else {
            System.out.println("Negative");
        }
    }
}
