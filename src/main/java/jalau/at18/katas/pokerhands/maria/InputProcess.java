package jalau.at18.katas.pokerhands.maria;

import java.util.ArrayList;
import java.util.List;

public class InputProcess {
    private static final int SIZE_ARRAY = 5;

    public List<String[]> splitInputString(String inputString) {
        List<String[]> splitString = new ArrayList<>();
        String[] playerOne = inputString.substring(0, inputString.length() / 2).split(" ");
        String[] playerTwo = inputString.substring((inputString.length() / 2) + 1).split(" ");
        splitString.add(playerOne);
        splitString.add(playerTwo);
        return splitString;
    }

    //Black:", "2H", "3D" "5S" 9C KD
    public PokerHand createHand(String[] handString) {
        Card[] listCards = convertStringToCards(handString);
        return new PokerHand(listCards);
    }

    private Card[] convertStringToCards(String[] handString) {
        Card[] listCards = new Card[SIZE_ARRAY];
        int counter = 0;
        for (CardValue element : CardValue.values()) {
            for (int index = 1; index < handString.length; index++) {
                if (element.getUIRepresentation() == handString[index].charAt(0)) {
                    Card card = new Card(element, handString[index].charAt(1));
                    listCards[counter] = card;
                    counter++;
                }
            }
        }
        return listCards;
    }

}
