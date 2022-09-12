package jalau.at18.katas.pokerhands.maria;

public class PokerWinnerIdentifier {
    private VerifyPokerHand verifyPokerHand = new VerifyPokerHand();

    public GameResult calculatePokerWinner(PokerHand handPlayOne, PokerHand handPlayTwo) {
        PokerHandRank pokerHandRankPlayOne = verifyPokerHand.returnTypePokerHand(handPlayOne);
        PokerHandRank pokerHandRankPlayTwo = verifyPokerHand.returnTypePokerHand(handPlayTwo);
        int resultPlayer1 = pokerHandRankPlayOne.getPokerHandType().getPokerHandvalue();
        int resultPlayer2 = pokerHandRankPlayTwo.getPokerHandType().getPokerHandvalue();
        return getResultByTypeOfHand(pokerHandRankPlayOne, pokerHandRankPlayTwo, resultPlayer1, resultPlayer2);
    }

    private GameResult getResultByTypeOfHand(PokerHandRank pokerHandRankPlayOne, PokerHandRank pokerHandRankPlayTwo,
                                             int resultPlayer1, int resultPlayer2) {
        if (resultPlayer1 > resultPlayer2) {
            return new GameResult(pokerHandRankPlayOne, "Player One");
        } else if (resultPlayer2 > resultPlayer1) {
            return new GameResult(pokerHandRankPlayTwo, "Player Two");
        } else {
            return getResultByTie(pokerHandRankPlayOne, pokerHandRankPlayTwo);
        }
    }

    private GameResult getResultByTie(PokerHandRank pokerHandRankPlayOne, PokerHandRank pokerHandRankPlayTwo) {
        if (pokerHandRankPlayOne.getCardValue().getRealNumberValue() > pokerHandRankPlayTwo.getCardValue().getRealNumberValue()) {
            return new GameResult(pokerHandRankPlayOne, "Player One");
        } else if (pokerHandRankPlayOne.getCardValue().getRealNumberValue() < pokerHandRankPlayTwo.getCardValue().getRealNumberValue()) {
            return new GameResult(pokerHandRankPlayTwo, "Player Two");
        } else {
            return new GameResult(null, "Tie");
        }
    }


}
