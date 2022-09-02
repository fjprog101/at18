package jalau.at18.katas.bankocr.mauricio;

public class BuildNumber {

    private String[][] matNumber;
    private CharValue value;
    private CharacterNumbers number;

    public BuildNumber(CharValue value, CharacterNumbers number) {
        this.value = value;
        this.number = number;
    }

    public String[][] buildANumber() {
        if (value == value.ONE) {
            matNumber = number.characterForOne();
            return matNumber;
        } else if (value == value.TWO) {
            matNumber = number.characterForTwo();
            return matNumber;
        }
        return secondPartBuildNumber();
    }

    public String[][] secondPartBuildNumber() {
        if (value == value.THREE) {
            matNumber = number.characterForThree();
            return matNumber;
        } else if (value == value.FOUR) {
            matNumber = number.characterForFour();
            return matNumber;
        }
        return thirdPartBuildNumber();
    }

    public String[][] thirdPartBuildNumber() {
        if (value == value.FIVE) {
            matNumber = number.characterForFive();
            return matNumber;
        } else if (value == value.SIX) {
            matNumber = number.characterForSix();
            return matNumber;
        }
        return fourthPartBuildNumber();
    }

    public String[][] fourthPartBuildNumber() {
        if (value == value.SEVEN) {
            matNumber = number.characterForSeven();
            return matNumber;
        } else if (value == value.EIGHT) {
            matNumber = number.characterForEight();
            return matNumber;
        }
        return fifthPartBuildNumber();
    }

    public String[][] fifthPartBuildNumber() {
        matNumber = number.characterForNine();
        return matNumber;
    }
}
