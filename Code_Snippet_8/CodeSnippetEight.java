package Code_Snippet_8;

public class CodeSnippetEight {

    private Movie getMovie() {
        return new Movie();
    }

    private Customer getCustomer() {
        return new Customer();
    }

    private int getDaysRented() {
        return 0;
    }

    public void calculateRent() {
        int priceCode = getMovie().getPriceCode();
        String title = getMovie().getTitle();
        String name = getCustomer().getName();
        String email = getCustomer().getEmail();
        int daysRented = getDaysRented();
        //some calculation
        getReceipt(priceCode, title, email, daysRented);

    }

    private void getReceipt(int price, String title, String email, int daysRented) {
        //..generate receipt
    }
}

class Movie {
    int getPriceCode() {
        return 0;
    }

    String getTitle() {
        return null;
    }
}

class Customer {

    String getName() {
        return null;
    }

    String getEmail() {
        return null;
    }
}
