package Code_Snippet_12;

import java.util.Date;

public class CodeSnippetTwelve {


  private static final Date SUMMER_START = new Date(2018, 4, 1);
  private static final Date SUMMER_END = new Date(2018, 9, 1);
  private int winterRate = 10;
  private int winterServiceCharge = 5;
  private int summerRate = 7;

  public static void main(String[] args) {


    int charge = new CodeSnippetTwelve().fetchCharge(new Date(2018, 5, 1), 3);


  }


  public int fetchCharge(Date date, int quantity) {
    int charge;
    if (date.before(SUMMER_START)
      || date.after(SUMMER_END)) {
      charge = quantity * winterRate + winterServiceCharge;
    }
    else {
      charge = quantity * summerRate;
    }

    return charge;
  }
}
