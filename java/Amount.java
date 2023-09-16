class Amount{
    private double amount;
    private String transactionType;

    //Constructor for initializing amount and transactionType
    public Amount(double amount, String transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }

    //method to get amount
    public double getAmount(){
        return amount;
    }

    //method to get transaction type
    public String getTransactionType(){
        return transactionType;
    }
}