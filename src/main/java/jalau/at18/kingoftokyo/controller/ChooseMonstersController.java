package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.Game;
import jalau.at18.kingoftokyo.Monster;
import jalau.at18.kingoftokyo.Player;
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

    public ChooseMonstersController(ChooseMonstersFrame monstersFrame, Game game, ArrayList<UsernameTextBox>  playersList, ArrayList<MonsterList> monstersList) {
        this.monstersFrame = monstersFrame;
        this.playersUsernameList = playersList;
        this.monstersList = monstersList;
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
        for (int i = 0; i < game.getPlayers(); i++) {
            Player player = new Player();
            player.setUserName(playersUsernameList.get(i).getText());
            player.setMonster(monstersList.get(i).getMonster());
            list.add(player);
            System.out.println(list.get(i).getUserName());
            System.out.println(list.get(i).getMonster());
        }
        game.setPlayersList(list);
    }
}
