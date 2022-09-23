package jalau.at18.architects.model;

public class GenerateARandomCardForResourceList {
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private int randomNum = (int) (Math.random() * ((six - one) + 1)) + one;

    public Card randomResourceCard() {
        switch (randomNum) {
            case one:
                return EnumResourceList.WATER.getCard();
            case two:
                return EnumResourceList.WOOD.getCard();
            case three:
                return EnumResourceList.STONE.getCard();
            case four:
                return EnumResourceList.PAPER.getCard();
            case five:
                return EnumResourceList.BRICK.getCard();
            default:
                return EnumResourceList.GOLD.getCard();
        }
    }

    public int getRandomNumber() {
        return randomNum;
    }
}
