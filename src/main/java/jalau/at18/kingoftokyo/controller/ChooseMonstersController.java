package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.Game;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.view.choosemonsters.ChooseMonstersFrame;
import jalau.at18.kingoftokyo.view.general.MonsterList;
import jalau.at18.kingoftokyo.view.general.UsernameTextBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChooseMonstersController implements ActionListener {
    private ChooseMonstersFrame monstersFrame;
    private WhoStartController whoStartController;
    // We need to implement the chain from where someone send us the Players.
    // for Open/close we need to receive a list<Player>
    private Player player1;
    private Player player2;
    private ArrayList<UsernameTextBox> playersUsernameList;
    private ArrayList<MonsterList> monstersList;
    private Game game;

    public ChooseMonstersController(ChooseMonstersFrame mFrame, Game game, ArrayList<UsernameTextBox>  pList, ArrayList<MonsterList> mList) {
        this.monstersFrame = mFrame;
        this.playersUsernameList = pList;
        this.monstersList = mList;
        this.game = game;
        player1 = new Player();
        player2 = new Player();
        //Right Now the code is HardCode
        player1.addMonster(Monster.ALIENOID);
        player2.addMonster(Monster.SPACE_PENGUIN);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        makePlayersList();
        monstersFrame.setVisible(false);
        //Should send two players
        whoStartController = new WhoStartController(player1, player2);
        whoStartController.showFrame();
    }

    private void makePlayersList() {
        ArrayList<Player> list = new ArrayList<>();
        for (int index = 0; index < game.getPlayers(); index++) {
            Player player = new Player();
            player.setUserName(playersUsernameList.get(index).getText());
            player.setMonster(monstersList.get(index).getMonster());
            list.add(player);
            System.out.println(list.get(index).getUserName());
            System.out.println(list.get(index).getMonster());
        }
        game.setPlayersList(list);
    }
}
