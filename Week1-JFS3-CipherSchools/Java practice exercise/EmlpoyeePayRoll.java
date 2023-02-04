import java.util.Scanner;

public class EmlpoyeePayRoll {
    public static void main(String[] args) {
//        Question: Ask the user to enter his BasicPay (Salary)
//        If the BasicPay is >= 5000 then
//        HRA will be 10% of BasicPay
//        DA will be 20% of BasicPay
//        If the BasicPay is < 5000 then
//        HRA will be 20% of BasicPay
//        DA will be 30% of BasicPay

//        Find the GrossPay.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter BasicPay of the Employee: ");
        double BasicPay = input.nextInt();
        double HRA = 0, DA = 0;

        if (BasicPay >= 5000) {
            HRA = 0.1 * BasicPay;
            DA = 0.2 * BasicPay;
        }
        else {
            HRA = 0.2 * BasicPay;
            DA = 0.3 * BasicPay;
        }
        System.out.println("HRA is: " + HRA);
        System.out.println("DA is: " + DA);
        System.out.println("GrossPay is: " + (BasicPay + HRA + DA));
    }
}
