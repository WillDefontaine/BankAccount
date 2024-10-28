public class BankAccount {
    private String customerFullName;
    private int accountID;
    private static int numberOfAccounts= 0;
    private String userID;
    private String password;
    private double accountBalance;

    public BankAccount(String customerFullName, String userID, String password) {
        this.customerFullName = customerFullName;
        this.accountID = numberOfAccounts;
        this.numberOfAccounts ++;
        this.userID = userID;
        this.password = password;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountID() {
        return accountID;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static void decreaseNumberOfAccounts () {
        numberOfAccounts --;

    }

    public void depositAmount (double depositAmount) {
        this.accountBalance += depositAmount;
    }

    public void withdrawAmount (double withdrawAmount) {
        this.accountBalance -= withdrawAmount;
    }
}
