// checking class extends/inherits Bank_Account class
public class Checking extends BankAccount{

    // daily withdrawal limit
    private double dailyWithdrawalLimit;

    // overloaded constructor for checking + throws exception if the password format is invalid
    public Checking(String customerFullName, String userID, String password) throws BankExceptions.InvalidPasswordFormatException {
        // calling bank_account constructor
        super(customerFullName, userID, password);
        // the limit
        this.dailyWithdrawalLimit = 300;
    }
    
    // getting the daily withdrawal limit
    public double getDailyWithdrawalLimit() { 
        return dailyWithdrawalLimit; 
    }
    // setting the daily withdrawal limit
    public void setDailyWithdrawalLimit(double limit) { 
        this.dailyWithdrawalLimit = limit; 
    }
}
