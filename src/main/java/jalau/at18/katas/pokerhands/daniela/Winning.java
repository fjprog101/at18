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

    public String defineWinnerinatie(PokerHand white, PokerHand black, CardValue whitecard, CardValue blackcard) {
        GameAnalizer winner1 = new GameAnalizer(black);
        GameAnalizer winner2 = new GameAnalizer(white);
        if (winner2.getscore() == winner1.getscore()) {
            // untie(white, black, whitecard, blackcard);
            return untie(white, black, whitecard, blackcard);
        }
        return "There is a winner already";
    }

    public int highCardWhite(PokerHand handwhite, CardValue cardwhite) {
        Cardssorted counter = new Cardssorted(handwhite);
        CardstoString count = counter.getCount();
        return count.highCard(cardwhite);
    }

    public int highCardBlack(PokerHand handBlack, CardValue cardBlack) {
        Cardssorted counter = new Cardssorted(handBlack);
        CardstoString count = counter.getCount();
        return count.highCard(cardBlack);
    }

    public String untie(PokerHand white, PokerHand black, CardValue whitecard, CardValue blackcard) {
        if (highCardWhite(white, whitecard) > highCardBlack(black, blackcard)) {
            return "Whitewins";
        } else {
            return "Blackwins";
        }
    }
}