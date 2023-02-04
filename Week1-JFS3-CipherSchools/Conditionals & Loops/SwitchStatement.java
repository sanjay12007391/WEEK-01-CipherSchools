import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
//        Get user Division and print his Rank
        Scanner input = new Scanner(System.in);
        int div = input.nextInt();

        switch(div) {
            case 1:
                System.out.println("First Rank");
                break;
            case 2:
                System.out.println("Second Rank");
                break;
            case 3:
                System.out.println("Third Rank");
                break;
            default:
                System.out.println("No Rank");
                break;
        }
    }
}
