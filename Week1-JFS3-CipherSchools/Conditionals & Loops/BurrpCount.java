import java.util.Scanner;

public class BurrpCount {
    public static void main(String[] args) {

//        Question: How long is your BURRRP?
//        Ask the user to enter an integer (burp length)
//        Depending on the inout provided 'Burp' will be provided.

//        For example:
//        The input is 4 then - Burrrrp
//        The input is 10 then - Burrrrrrrrrrp and so on..

        Scanner input = new Scanner(System.in);
        int BurpLength = input.nextInt();

        String msg = "";
        for (int i = 1; i <= BurpLength; i++) {
            msg = msg + "r"; //can also be written as msg+="r
        }
        System.out.println("Bu" + msg + "p");
    }
}
