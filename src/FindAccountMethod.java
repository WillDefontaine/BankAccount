private static BankAccount findAccount() throws CustomerAccountNotFoundException {
    System.out.print("Enter User ID: ");
    String userId = input.nextLine();
    System.out.print("Enter Password: ");
    String password = input.nextLine();
    
    // Goes through accounts to find matching userId and password
    return accounts.stream()
            .filter(acc -> acc.getUserId().equals(userId) && acc.getUserPassword().equals(password))
            .findFirst()
            .orElseThrow(() -> new CustomerAccountNotFoundException("Account not found."));
}
