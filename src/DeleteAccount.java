private static void deleteAccount() throws CustomerAccountNotFoundException {
    BankAccount account = findAccount(); // Locate the account using the user ID and password
    accounts.remove(account); // Remove the account from the ArrayList
    System.out.println("Account deleted successfully.");
}
