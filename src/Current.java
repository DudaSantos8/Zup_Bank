public class Current extends Account{
    private double serviceCharge;

    public Current(double balance, int accountNumber, int agencyNumber, Customer customer) {
        super(balance, accountNumber, agencyNumber, customer);
        this.serviceCharge = 0.032;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
}
