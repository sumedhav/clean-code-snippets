package Code_Snippet_5;

public class CodeSnippetFive {

    private int _quantity = 5;
    private int _itemPrice = 4;

    double getPrice() {
        int basePrice = _quantity * _itemPrice;
        double discountFactor;
        if(basePrice > 1000)
            discountFactor = 0.95;
        else
            discountFactor = 0.98;

        // some computation using basePrice

        return basePrice * discountFactor;
    }
}
