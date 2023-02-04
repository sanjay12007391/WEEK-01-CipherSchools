import java.util.Scanner;

public class PoliceTicket {
    public static void main(String[] args) {
//        Assuming you are riding a bike and police officer stops u
//        Police officer asking u to provide 2 details
//        ur current speed & if it ur bday?
//        The police officer will calculate find based on following parameters
//        If it's ur bday u will be waived off (exempted) with 5 miles/hour
//        If it's not ur bday no exemption will be given
//        if ur speed is greater than 80 ticket raised will be 'High Ticket'.
//        If ur speed is between 60 & 80 ticket raised will be 'Mid Ticket'.
//        If ur speed is below 60 no ticket will be raised

//        Find the ticket!!!
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed: ");
        int speed = input.nextInt();

        System.out.println("Today is your Birthday: ");
        boolean IsBirthday = input.nextBoolean();

        if (IsBirthday) {
            speed = speed - 5;
        }
        if (speed>80) {
            System.out.println("High Ticket");
        }
        else if (speed >= 60) {
            System.out.println("Mid Ticket");
        }
        else {
            System.out.println("No Ticket");
        }
    }
}
