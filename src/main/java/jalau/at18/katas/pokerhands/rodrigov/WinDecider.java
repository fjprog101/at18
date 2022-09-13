package jalau.at18.katas.pokerhands.rodrigov;

public class WinDecider {
    private UnTie unTie = new UnTie();

    public String winner(PokerHand handPlayerWhite, PokerHand handPlayerBlack) {
        Game player1Win = new Game(handPlayerBlack);
        Game player2Win = new Game(handPlayerWhite);
        String winningPlayer = player2Win.getScore() > player1Win.getScore() ? "Hand white player win" : "Hand black player win";
        return winningPlayer;
    }

    public String defineWinnerinatie(PokerHand whitePlayer1, CardValue whitecard, PokerHand blackPlayer2, CardValue blackcard) {
        Game player1Win = new Game(blackPlayer2);
        Game player2Win = new Game(whitePlayer1);
        if (player2Win.getScore() == player1Win.getScore()) {
            return untie(whitePlayer1, blackPlayer2, whitecard, blackcard);
        }
        return "There is a winner already";
    }

    public String untie(PokerHand white, PokerHand black, CardValue whitecard, CardValue blackcard) {
        if (unTie.handPlayer1(white, whitecard) > unTie.handPlayer2(black, blackcard)) {
            return "Hand white player win";
        } else {
            return "Hand black player win";
        }
    }
}
