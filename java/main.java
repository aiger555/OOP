public class main {
    public static void main(String[] args){
        //Created the object of PersonalAcc class
        PersonalAccount account = new PersonalAccount(8000, "Aigerim");

        //Inserting deposit
        account.deposit(9000);
        account.deposit(700);

        //Withdrawing our money
        account.withdraw(100);

        //Cheking balance
        System.out.println("Current balance: $" + account.getBalance());

        //Getting history of transactions
        account.printTransactionHistory();
    }
}
