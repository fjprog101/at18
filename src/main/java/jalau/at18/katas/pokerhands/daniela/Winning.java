package jalau.at18.katas.pokerhands.daniela;

public class Winning {
    public Winning() {
    }

    public String defineWinner(PokerHand White, PokerHand Black) {
        GameAnalizer winner1 = new GameAnalizer(Black);
        GameAnalizer winner2 = new GameAnalizer(White);
        String finalWinner = winner2.getscore() > winner1.getscore() ? "Player white wins" : "Player black wins";
        return finalWinner;
    }

    public String defineWinnerinatie(PokerHand White, PokerHand Black) {
        GameAnalizer winner1 = new GameAnalizer(Black);
        GameAnalizer winner2 = new GameAnalizer(White);
        if (winner2.getscore() == winner1.getscore()) {
            return "it's a tie";
        }
        return "There is a winner already";
    }
}