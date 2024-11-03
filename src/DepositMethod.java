private static void makeDeposit() throws CustomerAccountNotFoundException, NegativeDollarAmountException {
    BankAccount account = findAccount(); // Find the account
    System.out.print("Enter deposit amount: ");
    double amount = input.nextDouble(); // Show the deposit amount from the user
    input.nextLine(); // Clear the buffer
    account.depositAmount(amount); // Add the amount to account balance
    System.out.println("Deposit successful. New balance: " + account.getAccountBalance());
}
