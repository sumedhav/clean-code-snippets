package Code_Snippet_11;

public class Transaction {

  private float amount;
  private String transactionDate;

  public Transaction(float amount, String transactionDate) {
    this.amount = amount;
    this.transactionDate = transactionDate;
  }

  public static void main(String[] args) {

    Transaction transaction = new Transaction(200, "2017/01/01");

    if(transaction == null) {
      throw new RuntimeException("Invalid!!");
    }

  }
}
