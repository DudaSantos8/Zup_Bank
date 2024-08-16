public class Current extends Account{
    private double serviceCharge;
    private double specialCheck;

    public Current(double balance,double specialCheck, int accountNumber, int agencyNumber, Customer customer) {
        super(balance, accountNumber, agencyNumber, customer);
        this.specialCheck = specialCheck;
        this.serviceCharge = 0.032;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getSpecialCheck() {
        return specialCheck;
    }

    public void setSpecialCheck(double specialCheck) {
        this.specialCheck = specialCheck;
    }

    @Override
    public double withdrawalCash(double value){
        AccountValidation.validationSpecialCheck(this, value);
        return super.withdrawalCash(value);
    }

}
