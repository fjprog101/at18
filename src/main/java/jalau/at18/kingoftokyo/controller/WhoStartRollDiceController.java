package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.Dice;
import jalau.at18.kingoftokyo.model.DiceFace;
import jalau.at18.kingoftokyo.model.DiceFaceIdentifier;
import jalau.at18.kingoftokyo.model.DiceHand;
import jalau.at18.kingoftokyo.model.DiceFaceSameCounter;
import jalau.at18.kingoftokyo.model.DiceRoller;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabel;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;
import jalau.at18.kingoftokyo.view.whoStartsTheGame.ShowResultsPanel;
import jalau.at18.kingoftokyo.view.whoStartsTheGame.StartGameButton;
import jalau.at18.kingoftokyo.view.whoStartsTheGame.WhoStartFrame;

import java.util.ArrayList;
import java.util.List;

public class WhoStartRollDiceController {
    private static final int QUANTITY_DICES = 6;
    private RollDiceSectionUI rollDiceSectionUI;

    private List<DiceFace> listRandomDiceFace;

    //private  PlayerNameLabel playerNameLabel;
    private ShowResultsPanel  showResultsPanel;
    private int buttonCount;
    private int[] punchingList;
    private Player[] arrangePlayers;
    private WhoStartFrame whoStartFrame; //anadido
    private StartGameButton startGameButton; //anadido

    private int playermaxpunch;
    //public WhoStartRollDiceController(RollDiceSectionUI rollDiceSectionUI, PlayerNameLabel playerNameLabel) {
    public WhoStartRollDiceController(RollDiceSectionUI rollDiceSectionUI, ShowResultsPanel
        showResultsPanel, StartGameButton startGameButton) { //anadido


        this.rollDiceSectionUI = rollDiceSectionUI;
        this.showResultsPanel = showResultsPanel;
        this.startGameButton = startGameButton;
        buttonCount = 1;
        playermaxpunch = 0;
        punchingList = new int[showResultsPanel.getArrayPlayer().length];
        arrangePlayers = new Player[showResultsPanel.getArrayPlayer().length];

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
        //playerNameLabel.setPlayerName(getCountPounching());

        showResultsPanel.setTextComponent(buttonCount, getCountPounching());
        punchingList[buttonCount - 1] = getCountPounching();

        //comparerPunching(getCountPounching());
        comparerPunching(punchingList);  //anadido


        buttonCount++;
        if (buttonCount == showResultsPanel.getArrayPlayer().length + 1) {
            rollDiceSectionUI.getRollerDiceButton().setEnabled(false);
            startGameButton.setVisible(true); // no cambia de estado
        }
    }
    public void clickStartGameButton() { //anadido
        whoStartFrame.setVisible(false);
        //GameFrameController gameFrameController = new GameFrameController(arrangePlayers);
    }

//    public void comparerPunching(int actualPunching) {
    public int comparerPunching(int[] punchingList) { // anadido

        this.punchingList = punchingList;
        int maxPunch =  0;

        for (int index = 0; index < punchingList.length; index++) {
            if (punchingList[index] > maxPunch) {
                maxPunch =  punchingList[index];
                playermaxpunch = index;
            }
            /*
            if (punchingList[index] > actualPunching) {
                arrangePlayers[index] = showResultsPanel.getArrayPlayer()[buttonCount - 1];
            } else {
                if (punchingList[index] < actualPunching) {
                    punchingList[index] = actualPunching;
                    //punchingList[index] = punchingList[index];
                }
            }*/
        }
        return playermaxpunch;

    }

    public List<DiceFace> getListRandomDiceFace() {
        return listRandomDiceFace;
    }

    public int getCountPounching() {
        //List<DiceFace> diceFacesPlayer1 = whoStartFrame.getPlayer1Panel().getWhoStartRollDiceController().getListRandomDiceFace();
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
