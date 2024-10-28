public class BankExceptions {
    public BankExceptions(String message) {
    }

    public static class InvalidPasswordFormatException extends Exception {
        public InvalidPasswordFormatException(String message) {
            super(message);
        }
    }

    public class NegativeDollarAmountException extends Exception {
        public NegativeDollarAmountException(String message) {
            super(message);
        }
    }

    public class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    public class CustomerAccountNotFoundException extends Exception {
        public CustomerAccountNotFoundException(String message) {
            super(message);
        }
    }
}
