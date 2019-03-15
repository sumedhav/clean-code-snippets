package Code_Snippet_16;

import Code_Snippet_11.Transaction;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CodeSnippetSixteen {

  private float balance = 0;
  private List<Transaction> transactions = new ArrayList<>();

  public static void main(String[] args) {
    CodeSnippetSixteen codeSnippetSixteen = new CodeSnippetSixteen();
    codeSnippetSixteen.credit(200);
    codeSnippetSixteen.debit(100);
  }


  public void credit(float amount) {
    balance += amount;
    Calendar calendar = Calendar.getInstance();
    String transactionDate = calendar.get(Calendar.DATE) + "/" +
      calendar.get(Calendar.MONTH) + "/" +
      calendar.get(Calendar.YEAR);

    transactions.add(new Transaction(amount, transactionDate));
  }

  public void debit(float amount) {
    balance -= amount;
    Calendar calendar = Calendar.getInstance();
    String transactionDate = calendar.get(Calendar.DATE) + "/" +
      calendar.get(Calendar.MONTH) + "/" +
      calendar.get(Calendar.YEAR);

    transactions.add(new Transaction(-amount, transactionDate));
  }


}
