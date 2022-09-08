package jalau.at18.katas.pokerhands.daniela;

public class Winning extends TieBraker {

    public Winning() {
    }

    public String defineWinner(PokerHand white, PokerHand black) {
        GameAnalizer winner1 = new GameAnalizer(black);
        GameAnalizer winner2 = new GameAnalizer(white);
        String finalWinner = winner2.getscore() > winner1.getscore() ? "Player white wins" : "Player black wins";
        return finalWinner;
    }

    public String defineWinnerinatie(PokerHand white, PokerHand black, CardValue whitecard, CardValue blackcard) {
        GameAnalizer winner1 = new GameAnalizer(black);
        GameAnalizer winner2 = new GameAnalizer(white);
        if (winner2.getscore() == winner1.getscore()) {
            return untie(white, black, whitecard, blackcard);
        }
        return "There is a winner already";
    }

    public String untie(PokerHand white, PokerHand black, CardValue whitecard, CardValue blackcard) {
        if (highCardWhite(white, whitecard) > highCardBlack(black, blackcard)) {
            return "Whitewins";
        } else {
            return "Blackwins";
        }
    }
}