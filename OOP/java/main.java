public class main {
    public static void main(String[] args) {
        try {
            PersonalAccount account = new PersonalAccount(8000, "Aigerim");

            account.deposit(9000);
            account.deposit(700);

            account.withdraw(100);

            System.out.println("Current balance: $" + account.getBalance());

            account.printTransactionHistory();
        } catch (InvalidDepositException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
