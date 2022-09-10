package jalau.at18.katas.pokerhands.maria;

public class PokerWinnerIdentifier {
    private PokerHand handPlayOne;
    private PokerHand handPlayTwo;
    private VerifyPokerHand verifyPokerHand;

    public PokerWinnerIdentifier(PokerHand handPlayOne, PokerHand handPlayTwo) {
        this.handPlayOne = handPlayOne;
        this.handPlayTwo = handPlayTwo;
        verifyPokerHand = new VerifyPokerHand();
    }

    public GameResult calculatePokerWinner() {
        PokerHandRank pokerHandRankPlayOne = verifyPokerHand.returnTypePokerHand(handPlayOne);
        PokerHandRank pokerHandRankPlayTwo = verifyPokerHand.returnTypePokerHand(handPlayTwo);
        int resultPlayer1 = pokerHandRankPlayOne.getPokerHandType().getPokerHandvalue();
        int resultPlayer2 = pokerHandRankPlayTwo.getPokerHandType().getPokerHandvalue();
        if (resultPlayer1 > resultPlayer2) {
            return new GameResult(pokerHandRankPlayOne, "Player One");
        } else if (resultPlayer1 < resultPlayer2) {
            return new GameResult(pokerHandRankPlayTwo, "Player Two");
        } else {
            if (pokerHandRankPlayOne.getCardValue().getRealNumberValue() > pokerHandRankPlayTwo.getCardValue().getRealNumberValue()) {
                return new GameResult(pokerHandRankPlayOne, "Player One");
            } else if (pokerHandRankPlayOne.getCardValue().getRealNumberValue() < pokerHandRankPlayTwo.getCardValue().getRealNumberValue()) {
                return new GameResult(pokerHandRankPlayTwo, "Player Two");
            } else {
                return new GameResult(null, "Tie");
            }
        }
    }
}
