package jalau.at18.kingoftokyo;

public class DiceFaceSameCounter {
    private DiceHand diceHand;

    public DiceFaceSameCounter(DiceHand listDiceHand) { //random list
        this.diceHand = listDiceHand;
    }

    public DiceFaceIndentifier diceFaceCounter() {
        DiceFaceIndentifier newDiceIdentifier = new DiceFaceIndentifier();
        for (Dice randomDice : diceHand.getListDices()) {
            newDiceIdentifier.addDiceFaceWithCount(randomDice.getDiceFace());
        }

        return newDiceIdentifier;
    }

}
