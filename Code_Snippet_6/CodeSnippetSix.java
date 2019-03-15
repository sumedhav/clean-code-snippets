package Code_Snippet_6;

public class CodeSnippetSix {

    public static void main(String args) {
        new Account().gamma(3, 4, 5);
        new Account().gamma(4, 7, 8);
    }
}

class Account {

    private int delta() {
        return 3;
    }

    void gamma(int inputVal, int quantity, int yearToDate) {
        int importantValue1 = (inputVal * quantity) + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100)
            importantValue2 -= 20;
        int importantValue3 = importantValue2 * 7;
        // and so on.
    }
}
