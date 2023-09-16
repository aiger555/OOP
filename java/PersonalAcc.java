import java.util.ArrayList;
import java.util.List;

class PersonalAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private List<Amount> transactions;

    //Constructor for initializing amountNumber, Holder, balance and transactions
    public PersonalAccount(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    //method for inserting deposit to bank account
    public void deposit(double amount){
        if (amount>0){
            balance += amount;
            transactions.add(new Amount(amount, "Deposit"));
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
        }
    
    //method for taking out money from bank account
    public void withdraw(double amount){
        if(amount>0 && balance >= amount){
            balance -= amount;
            transactions.add(new Amount(amount, "Withdrawal"));
            System.out.println("Withdrawn $" + amount);
        }else{
            System.out.println("Invalid amount or insufficient funds");
        }
        }

    //method for getting history of transactioncs 
    public void printTransactionHistory(){
        System.out.println("Transaction history of: " + accountNumber);
        for (Amount transaction : transactions){
            System.out.println(transaction.getTransactionType() + ": $" + transaction.getAmount());
        }
    }

    //method to get balance
    public double getBalance(){
        return balance;
    }

    //method to get accountNumber
    public int getAccountNumber(){
        return accountNumber;
    }

    //method to get name of account Holder
    public String getAccountHolder(){
        return accountHolder;
    }
}
    
