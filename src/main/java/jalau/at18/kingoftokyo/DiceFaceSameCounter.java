package jalau.at18.kingoftokyo;

public class DiceFaceSameCounter {
    private DiceHand diceHand;

    public DiceFaceSameCounter(DiceHand listDiceHand) {
        this.diceHand = listDiceHand;
    }

    public DiceIndentifier diceFaceCounter() { //agarra la lista del ramdom y cuenta la cantidad caras del dado repetidos
        DiceIndentifier newDiceIdentifier = new DiceIndentifier();
        for (Dice randomDice : diceHand.getListDices()) {
            newDiceIdentifier.addDiceWithCount(randomDice.getDiceFace());
        }

        return newDiceIdentifier;
    }

}
