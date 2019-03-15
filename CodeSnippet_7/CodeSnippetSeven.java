package CodeSnippet_7;

public class CodeSnippetSeven {

    public static void main(String args[]) {

        Bird bird = new Bird(7, false);
        double europeanBirdSpeed = bird.getSpeed(BirdType.EUROPEAN);
        double africanBirdSpeed = bird.getSpeed(BirdType.AFRICAN);
    }

}


class Bird {

    private double numberOfCoconuts;
    private boolean isNailed;

    Bird(double numberOfCoconuts, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.isNailed = isNailed;
    }

    private double getBaseSpeed() {
        return 4.5;
    }

    private double getLoadFactor() {
        return 2;
    }

    double getSpeed(BirdType birdType) {
        switch (birdType) {
            case EUROPEAN:
                return getBaseSpeed();
            case AFRICAN:
                return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
            case NORWEGIAN_BLUE:
                return (isNailed) ? 0 : getBaseSpeed();
        }

        throw new RuntimeException("Should be unreachable");
    }
}

enum BirdType {
    EUROPEAN,
    AFRICAN,
    NORWEGIAN_BLUE
}

