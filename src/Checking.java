public class Checking extends BankAccount{

    private double dailyWithdrawalLimit;

    public Checking(String customerFullName, String userID, String password) throws BankExceptions.InvalidPasswordFormatException {
        super(customerFullName, userID, password);
        this.dailyWithdrawalLimit = 300;
    }

    public double getDailyWithdrawalLimit() { return dailyWithdrawalLimit; }
    public void setDailyWithdrawalLimit(double limit) { this.dailyWithdrawalLimit = limit; }
}
