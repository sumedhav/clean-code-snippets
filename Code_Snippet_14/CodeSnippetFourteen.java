package Code_Snippet_14;

public class CodeSnippetFourteen {


  private boolean isDead;
  private boolean isSeparated;
  private boolean isRetired;

  public static void main(String[] args) {

    double amount = new CodeSnippetFourteen().getPayAmount();

  }

  public double getPayAmount() {
    double result;
    if (isDead) {
      result = deadAmount();
    }
    else {
      if (isSeparated) {
        result = separatedAmount();
      }
      else {
        if (isRetired) {
          result = retiredAmount();
        }
        else {
          result = normalPayAmount();
        }
      }
    }
    return result;
  }

  private double deadAmount() {
    return 0;
  }

  private double separatedAmount() {
    return 0;
  }

  private double retiredAmount() {
    return 0;
  }

  private double normalPayAmount() {
    return 0;
  }
}
