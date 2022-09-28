package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.*;
import jalau.at18.kingoftokyo.view.rolldicesection.*;
import jalau.at18.kingoftokyo.view.whostart.*;
import java.util.ArrayList;
import java.util.List;

public class WhoStartRollDiceController {
    private static final int QUANTITY_DICES = 6;
    private RollDiceSectionUI rollDiceSectionUI;
    private List<DiceFace> listRandomDiceFace;
    private ShowResultsPanel  showResultsPanel;
    private int buttonCount;
    private ArrayList<Integer> punchingList;
    private ArrayList<Player> arrangePlayers;
    private WhoStartFrame whoStartFrame;
    private StartGameButton startGameButton;

    public WhoStartRollDiceController(WhoStartFrame whoStartFrame, RollDiceSectionUI rollDiceSectionUI, ShowResultsPanel
        showResultsPanel, StartGameButton startGameButton) {

        this.whoStartFrame = whoStartFrame;
        this.rollDiceSectionUI = rollDiceSectionUI;
        this.showResultsPanel = showResultsPanel;
        this.startGameButton = startGameButton;
        buttonCount = 1;
        punchingList = new ArrayList<Integer>();
        arrangePlayers = new ArrayList<Player>();

        rollDiceSectionUI.getRollerDiceButton().addActionListener(e -> rollDices());
        listRandomDiceFace = new ArrayList<>();
    }

    private void rollDices() {
        DiceRoller diceRoller = new DiceRoller();
        listRandomDiceFace = diceRoller.randomDice(QUANTITY_DICES);

        int count = 0;
        for (DiceFaceLabel diceFaceLabel : rollDiceSectionUI.getListDiceFaceLabel()) {
            diceFaceLabel.paintDiceFace(listRandomDiceFace.get(count));
            count++;
        }
        showResultsPanel.setTextComponent(buttonCount, getCountPounching());
        comparerPunchin(getCountPounching());
        buttonCount++;
        if (buttonCount == showResultsPanel.getArrayPlayer().size() + 1) {
            rollDiceSectionUI.getRollerDiceButton().setEnabled(false);
            startGameButton.setEnabled(true);
        }
    }
    public void clickStartGameButton() {
        whoStartFrame.setVisible(false);
        Turn turn = new Turn(arrangePlayers);
        new GameFrame(turn);
    }

    public void comparerPunchin(int getCountPounching) {
        if (arrangePlayers.size() == 0) {
            punchingList.add(getCountPounching);
            arrangePlayers.add(showResultsPanel.getArrayPlayer().get(buttonCount - 1));

        } else {
            for (int index = 0; index < buttonCount; index++) {
                if (getCountPounching > punchingList.get(index)) {
                    punchingList.add(index, getCountPounching);
                    arrangePlayers.add(index, showResultsPanel.getArrayPlayer().get(buttonCount - 1));
                    break;
                } else if (index == punchingList.size() - 1) {
                    punchingList.add(getCountPounching);
                    arrangePlayers.add(showResultsPanel.getArrayPlayer().get(buttonCount - 1));
                    break;
                }
            }
        }
    }

    public List<DiceFace> getListRandomDiceFace() {
        return listRandomDiceFace;
    }

    public int getCountPounching() {
        List<Dice> dicePlayer1 = new ArrayList<>();
        for (DiceFace diceFace : listRandomDiceFace) {
            dicePlayer1.add(new Dice(diceFace));
        }
        DiceHand diceHandPlayer1 = new DiceHand(dicePlayer1);
        DiceFaceSameCounter diceFaceSameCounterPlayer1 = new DiceFaceSameCounter(diceHandPlayer1);
        DiceFaceIdentifier diceFaceIdentifier1 = diceFaceSameCounterPlayer1.diceFaceCounter();
        int countPounchingPlayer1 = diceFaceIdentifier1.getCountDiceFace(DiceFace.PUNCHING);
        return countPounchingPlayer1;
    }
}
