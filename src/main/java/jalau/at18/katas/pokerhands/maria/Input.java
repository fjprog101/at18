package jalau.at18.katas.pokerhands.maria;

import java.util.List;

public class Input {
    private PokerWinnerIdentifier pokerWinnerIdentifier;
    private InputProcess inputProcess;

    public Input() {
        inputProcess = new InputProcess();
    }

    public GameResult initGame(String inputString) {
        List<String[]> splitString = inputProcess.splitInputString(inputString);
        PokerHand playerOne = inputProcess.createHand(splitString.get(0));
        PokerHand playerTwo = inputProcess.createHand(splitString.get(1));
        pokerWinnerIdentifier = new PokerWinnerIdentifier();
        return pokerWinnerIdentifier.calculatePokerWinner(playerOne, playerTwo);
    }
}
