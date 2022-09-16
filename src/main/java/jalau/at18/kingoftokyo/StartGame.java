package jalau.at18.kingoftokyo;

public class StartGame {
    private DiceHand player1;
    private DiceHand player2;

    public StartGame(DiceHand player1, DiceHand player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getWhoStart() {

        DiceFaceSameCounter diceFaceSameCounteplayer1 = new DiceFaceSameCounter(player1);
        DiceFaceSameCounter diceFaceSameCounteplayer2 = new DiceFaceSameCounter(player2);

        DiceFaceIndentifier playerplayer1 = diceFaceSameCounteplayer1.diceFaceCounter(); // >  3
        DiceFaceIndentifier playerplayer2 = diceFaceSameCounteplayer2.diceFaceCounter(); // <  4

        if (playerplayer1.getCountDiceFace(DiceFace.PUNCHING) > playerplayer2.getCountDiceFace(DiceFace.PUNCHING)) {
            return "Start Play player 1";
        }
        return "Start Play player 2";
    }
}
