package jalau.at18.architects.model.cards;

import java.util.Random;

public class RandomColor {
    private String finalColor;
    private int numberIdentifier;

    public RandomColor() {
        this.finalColor = "";
        Random random = new Random();
        numberIdentifier = random.nextInt(Colors.values().length) + 1;
    }

    public void randomColor() {
        for (Colors color:Colors.values()) {
            if (color.getNumberIdentifier() == numberIdentifier) {
                finalColor = color.getColor();
            }
        }
    }
    public String getFinalColor() {
        randomColor();
        return finalColor;
    }
    public void setRandomNumber(int numberTest) {
        numberIdentifier = numberTest;
    }
}
