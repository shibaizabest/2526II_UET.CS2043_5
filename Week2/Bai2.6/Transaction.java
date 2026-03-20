public class Transaction{
    private String transactionId, amount, timestamp;

    public Transaction(String transactionId, String amount, String timestamp){
        this.transactionId = transactionId;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public Transaction(Transaction other){
        this.transactionId = other.transactionId;
        this.amount = other.amount;
        this.timestamp = other.timestamp;
    }

    @Override
    public String toString(){
        return transactionId + ' ' +amount+ ' ' + timestamp + '\n';
    }
}