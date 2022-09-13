package jalau.at18.katas.pokerhands.rodrigob;

import jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers.HandsValue;
import jalau.at18.katas.pokerhands.rodrigob.Ranks.RankHandIdentifier;

public class Printer {

    private RankHandIdentifier handWinner;

    public Printer() {
        this.handWinner = new RankHandIdentifier();
    }

    public String output(Player winner) {
        if (winner.getPlayerName().equals("Tie")) {
            return "Tie.";
        }
        return nameWinner(winner) + " wins. - with " + nameHandWinner(winner);
    }

    public String nameWinner(Player winner) {
        return winner.getPlayerName();
    }

    public String nameHandWinner(Player winner) {
        return HandsValue.values()[handWinner.getRankHand(winner.getPlayerHand())].name();
    }
}
