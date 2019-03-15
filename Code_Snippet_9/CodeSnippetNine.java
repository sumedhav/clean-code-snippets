package Code_Snippet_9;

public class CodeSnippetNine {
    private int __quantity;
    private int _itemPrice;

    double getPrice() {
        int basePrice = __quantity * _itemPrice;
        int discountLevel;

        if (__quantity > 100)
            discountLevel = 2;
        else
            discountLevel = 1;

        double finalPrice = discountedPrice(basePrice, discountLevel);
        return finalPrice;

    }

    private double discountedPrice(int basePrice, int discountLevel) {
        if(discountLevel == 2)
            return basePrice * 0.1;
        else
            return basePrice * 0.05;
    }
}
