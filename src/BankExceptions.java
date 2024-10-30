// class to hold all the bank exceptions
public class BankExceptions {
    // base constructor
    public BankExceptions(String message) {
    }

    // invalid password exception
    public static class InvalidPasswordFormatException extends Exception {
        public InvalidPasswordFormatException(String message) {
            super(message);
        }
    }

    // negative dollar ammount exception
    public class NegativeDollarAmountException extends Exception {
        public NegativeDollarAmountException(String message) {
            super(message);
        }
    }

    // insufficient funds exceptions
    public class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    // unable to find customer account exception
    public class CustomerAccountNotFoundException extends Exception {
        public CustomerAccountNotFoundException(String message) {
            super(message);
        }
    }
}
