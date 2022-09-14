package jalau.at18.kingoftokyo;

import java.util.ArrayList;
import java.util.List;

public class DiceRoller {
    private static final int COUNT_DICE = 6;
    private RandomDice randomDice;

    public DiceRoller() {
        this.randomDice = new RandomDice();
    }

    //This method generated the list with random values.
    public List<Dice> randomDice() { // No olvidar que aqui recibira la cantidad de randoms a generar a la lista
        List<Dice> newlistDice = new ArrayList<>();
        for (int count = 0; count < COUNT_DICE; count++) {
            Dice dice = randomDice.generatedRandom();
            newlistDice.add(dice);
        }
        return newlistDice;
    }



// Borrar
    public String showListDices() {
        List<Dice> listDiceRandom = randomDice();
        String numbersRandom = "";
        for (int count = 0; count < listDiceRandom.size(); count++) {
            numbersRandom = numbersRandom + String.valueOf(listDiceRandom.get(count).getDiceFace().getRepresentativeValue());
        }
        return numbersRandom;
    }

    public boolean verifyShowListDices() {
        if (!showListDices().isEmpty()) {
            return true;
        }
        return false;
    }
}
