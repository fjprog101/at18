package jalau.at18.katas.pokerhands.daniela;

public class Winning {
    public Winning() {
    }

    public String defineWinner(PokerHand white, PokerHand black) {
        GameAnalizer winner1 = new GameAnalizer(black);
        GameAnalizer winner2 = new GameAnalizer(white);
        String finalWinner = winner2.getscore() > winner1.getscore() ? "Player white wins" : "Player black wins";
        return finalWinner;
    }

    public String defineWinnerinatie(PokerHand white, PokerHand black) {
        GameAnalizer winner1 = new GameAnalizer(black);
        GameAnalizer winner2 = new GameAnalizer(white);
        if (winner2.getscore() == winner1.getscore()) {
            return "it's a tie";
        }
        return "There is a winner already";
    }
}