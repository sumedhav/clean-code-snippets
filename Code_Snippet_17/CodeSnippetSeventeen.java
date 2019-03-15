package Code_Snippet_17;

public class CodeSnippetSeventeen {

  public static void main(String[] args) {
    double residentialBillableAmount = new ResidentialProperty().getBillableAmount();
    double commercialBillableAmount = new CommercialPropery().getBillableAmount();

  }

}

abstract class Property {
  public static double TAX_RATE = 0.50;
  public abstract double getBillableAmount();
}

class ResidentialProperty extends Property {

  public double getBillableAmount() {
    double base = 22 * 0.5;
    double tax = base * Property.TAX_RATE * 0.2;
    return base + tax;
  }
}

class CommercialPropery extends Property {

  public double getBillableAmount() {
    double base = 22;
    double tax = base * Property.TAX_RATE;
    return base + tax;
  }
}
