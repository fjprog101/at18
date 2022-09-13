package jalau.at18.katas.pokerhands.maria;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //String input = "Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C AH";
        //String input = "Black: 2H 4S 4C 2D 4H  White: 2S 8S AS QS 3S";
        String input = "Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C KH";
        //String input = "Black: 2H 3D 5S 9C KD  White: 2D 3H 5C 9S KH";
        Input inputData = new Input();
        GameResult gameResult = inputData.initGame(input);
        String player = gameResult.getWinnerPlayer();
        PokerHandType pokerHandType = gameResult.getPokerHandRank().getPokerHandType();
        List<CardValue> listCardValue = gameResult.getPokerHandRank().getListCardValue();
        System.out.println(player + " wins. - with " + pokerHandType + ": " + listCardValue);
    }
}
