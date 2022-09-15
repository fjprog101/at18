package jalau.at18.kingoftokyo;

public class DiceFaceSameCounter {
    private DiceHand diceHand;

    public DiceFaceSameCounter(DiceHand listDiceHand) { //random list
        this.diceHand = listDiceHand;
    }

    public DiceIndentifier diceFaceCounter() { // grab the random list and count the number of repeated dice faces
        DiceIndentifier newDiceIdentifier = new DiceIndentifier();
        for (Dice randomDice : diceHand.getListDices()) {
            newDiceIdentifier.addDiceWithCount(randomDice.getDiceFace());
        }

        return newDiceIdentifier;
    }

}
