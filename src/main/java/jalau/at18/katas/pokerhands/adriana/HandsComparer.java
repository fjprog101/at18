package jalau.at18.katas.pokerhands.adriana;

public class HandsComparer {

    public HandsComparer() {
    }

    public String getWinner(PokerHand playerA, PokerHand playerB) {
        Rank rank = new Rank();
        String winner = (rank.getRank(playerA) > rank.getRank(playerB)) ? playerA.getPlayer() : playerB.getPlayer();
        return winner;
    }
}
