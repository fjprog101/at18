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

    public ChooseMonstersController(ChooseMonstersFrame mFrame, ArrayList<UsernameTextBox>  pList, ArrayList<MonsterList> mList) {
        this.monstersFrame = mFrame;
        this.playersUsernameList = pList;
        this.monstersList = mList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        makePlayersList();
        monstersFrame.dispose();
        new WhoStartFrame(Game.getInstance().getPlayersList());
    }

    private void makePlayersList() {
        ArrayList<Player> list = new ArrayList<>();
        for (int index = 0; index < Game.getInstance().getPlayers(); index++) {
            Player player = new Player();
            player.setUserName(playersUsernameList.get(index).getText());
            player.setMonster(monstersList.get(index).getMonster());
            list.add(player);
            System.out.println(list.get(index).getUserName());
            System.out.println(list.get(index).getMonster());
        }
        Game.getInstance().setPlayersList(list);
    }
}
