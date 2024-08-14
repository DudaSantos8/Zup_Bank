public abstract class Account {
    private double balance;
    private int accountNumber;
    private int agencyNumber;

    private Customer customer;

    public Account(double balance, int accountNumber, int agencyNumber, Customer customer) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.agencyNumber = agencyNumber;
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
