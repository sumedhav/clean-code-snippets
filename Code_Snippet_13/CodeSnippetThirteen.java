package Code_Snippet_13;

public class CodeSnippetThirteen {


  private int seniority;
  private int monthsDisabled;
  private boolean isPartTime;

  public static void main(String[] args) {

    double amount = new CodeSnippetThirteen().disabilityAmount();

  }

  double disabilityAmount() {
    if (seniority < 2) {
      return 0;
    }
    if (monthsDisabled > 12) {
      return 0;
    }
    if (isPartTime) {
      return 0;
    }
    //Compute the disability amount.
    //...
    return Math.random();
  }
}
