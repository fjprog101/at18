package jalau.at18.kingoftokyo.model;

public class DiceFaceSameCounter {
    private DiceHand diceHand;

    public DiceFaceSameCounter(DiceHand listDiceHand) { //random list
        this.diceHand = listDiceHand;
    }

    public DiceFaceIdentifier diceFaceCounter() {
        DiceFaceIdentifier newDiceIdentifier = new DiceFaceIdentifier();
        for (Dice randomDice : diceHand.getListDices()) {
            newDiceIdentifier.addDiceFaceWithCount(randomDice.getDiceFace());
        }

        return newDiceIdentifier;
    }

}
