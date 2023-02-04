interface OlaCustomer{
    void bookCab();
    void findARide();
    void rentCab();
    void rateDriver();
    void scheduleCab();
    void cancelCab();
    void addMoneyToWallet();
    void raiseTicket();
    void signup();
    void signIn();
}

interface OlaDriver{
    void acceptBooking();
    void getCustomerLocation();
    void setAvailableStatus();
    void getMyCommission();
    void raiseMoneyTransferRequest();
    void callCustomer();
    void setUpYourVehicle();
    void customerFeedback();
}

interface OlaOwner{
    void getDriverRecords();
    void getReportByDriverId();
    void getReportByRegion();
    void getTotalRevenue();
    void getCustomersFeedback();
    void addDriver();
    void removeDriver();
    void chnageDriverStatus();
}
public class OlaExample {
    public static void main(String[] args) {

    }
}
