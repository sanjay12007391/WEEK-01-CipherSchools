public class Program1 {
    public static void main(String[] args) {

//        Making the variable private and wrapping it up in class is called Encapsulation
//        Encapsulation is basically known as hiding the data that is confidential
//        Access modifiers : Private, Public, Protected
        Amazon customer = new Amazon();
        float payableAmount = customer.Transaction(1000);
        System.out.println("Total Payable: " + payableAmount);
    }
}
 class Amazon {
    float Transaction(float amount) {
        Gpay gpayObj = new Gpay();
        gpayObj.setTxnCharge(0.07f);
        float totalAmount = amount + (amount * gpayObj.getTxnCharge());
        return totalAmount;
    }
 }

 class Gpay {
    private float txnCharge = 0.05f;
    public void setTxnCharge(float newCharge) {
        if (newCharge <= 0.05f) {
            System.out.println("Invalid TxnCharge");
            return;
        }
        txnCharge = newCharge;
    }
    public float getTxnCharge() {
        return txnCharge;
    }
 }
