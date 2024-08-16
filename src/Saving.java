import java.time.Instant;
import java.util.Date;

public class Saving extends Account {
    private double financialIncome;

    public Saving(double balance, int accountNumber, int agencyNumber, Customer customer) {
        super(balance, accountNumber, agencyNumber, customer);
        this.financialIncome = 0.5;
    }

    public double getFinancialIncome() {
        return financialIncome;
    }

    public void setFinancialIncome(double financialIncome) {
        this.financialIncome = financialIncome;
    }

    public double simulateIncome(double value, Date limitDate){
        int months = DateManipulator.getMonthDifferenceOfTwoDates(Date.from(Instant.now()), limitDate);
        return (value * this.financialIncome) * months + value;
    }

    @Override
    public double transferMoney(Account destinyAccount, double value) {
        AccountValidation.validationMoneyAccount(destinyAccount, value);
        this.withdrawalCash(value);
        destinyAccount.deposit(value);
        return super.transferMoney(destinyAccount,value);
    }

}
