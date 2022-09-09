package jalau.at18.katas.pokerhands.fernanda;

public class DetermineWinningHand {

    public String determineWinner(PokerHand white, PokerHand black) {
        HandAnalizer firsthand = new HandAnalizer(white);
        HandAnalizer secondhand = new HandAnalizer(black);
        String winner = secondhand.gettotalpoints() > firsthand.gettotalpoints() ? "Black wins" : "White wins";
        return winner;
    }
}
