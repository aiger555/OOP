import java.util.ArrayList;
import java.util.List;

class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private List<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) throws InvalidDepositException {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Amount(amount, "Deposit"));
            System.out.println("Deposited $" + amount);
        } else {
            throw new InvalidDepositException();
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add(new Amount(amount, "Withdrawal"));
            System.out.println("Withdrawn $" + amount);
        } else {
            throw new InsufficientFundsException();
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction history of: " + accountNumber);
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": $" + transaction.getAmount());
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}