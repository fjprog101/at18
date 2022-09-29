package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.Game;
import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.choosemonsters.ChooseMonstersFrame;
import jalau.at18.kingoftokyo.view.general.*;
import jalau.at18.kingoftokyo.view.whostart.WhoStartFrame;
import java.awt.event.*;
import java.util.ArrayList;

public class ChooseMonstersController implements ActionListener {
    private ChooseMonstersFrame monstersFrame;
    private ArrayList<UsernameTextBox> playersUsernameList;
    private ArrayList<MonsterList> monstersList;
    private Game game;

    public ChooseMonstersController(ChooseMonstersFrame mFrame, Game game, ArrayList<UsernameTextBox>  pList, ArrayList<MonsterList> mList) {
        this.monstersFrame = mFrame;
        this.playersUsernameList = pList;
        this.monstersList = mList;
        this.game = game;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        makePlayersList();
        monstersFrame.setVisible(false);
        new WhoStartFrame(game.getPlayersList());
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
