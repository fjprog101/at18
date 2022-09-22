package jalau.at18.architects;

import java.util.Random;

public class RandomColor {
    private String finalColor;
    private int numberIdentifier;

    public RandomColor() {
        this.finalColor = "";
        randomColor();
    }

    public void randomColor() {
        numberIdentifier = new Random().nextInt(Colors.values().length);
        for (Colors color:Colors.values()) {
            if (color.getNumberIdentifier() == numberIdentifier) {
                finalColor = color.getColor();
            }
        }
    }
    public String getFinalColor() {
        return finalColor;
    }
}
