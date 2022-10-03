package jalau.at18.architects.controller;

import org.junit.Test;
import jalau.at18.architects.view.BoardFrame;;
import jalau.at18.architects.view.PlayerStatus;
import jalau.at18.architects.view.ResourcePanel;
import jalau.at18.architects.view.SciencePanel;
import jalau.at18.architects.model.Game;
import jalau.at18.architects.model.player.Player;
import jalau.at18.architects.model.wonders.RandomWonder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import java.util.ArrayList;
import java.util.List;
public class ElementsControllerTest {
    @Test
    public void shoulPlayWith2Players() {
        Game game = Game.getInstance();
        game.reset();
        List<String> names = new ArrayList<>();
        names.add("Alvaro");
        names.add("Mauri");
        game.initGame(2, names);
        BoardFrame boardFrame = new BoardFrame(game);
        RandomWonder random = new RandomWonder();
        ResourcePanel resourcePanel =  new ResourcePanel();
        SciencePanel sciencePanel = new SciencePanel();
        Player player = game.getPlayer();
        BarConflictController barController = new BarConflictController(boardFrame, game);
        Component[] comp = boardFrame.getContentPane().getComponents();
        JButton button = (JButton) comp[2];
        assertEquals(3, comp.length);
        ActionEvent event= new ActionEvent(button, 1001, "Turn Finish");
        barController.actionPerformed(event);
        comp = boardFrame.getContentPane().getComponents();
        assertEquals(4, comp.length);
        PlayerStatus playerStatus = (PlayerStatus) comp[3];
        playerStatus.setPanels(resourcePanel, sciencePanel);
        assertEquals(9, playerStatus.getComponentCount());
        
   }

   @Test
    public void shoulPlayWith3Players() {
        Game game = Game.getInstance();
        game.reset();
        List<String> names = new ArrayList<>();
        names.add("Alvaro");
        names.add("Mauri");
        names.add("Juan");
        game.initGame(3, names);
        BoardFrame boardFrame = new BoardFrame(game);
        RandomWonder random = new RandomWonder();
        ResourcePanel resourcePanel =  new ResourcePanel();
        SciencePanel sciencePanel = new SciencePanel();
        Player player = game.getPlayer();
        BarConflictController barController = new BarConflictController(boardFrame, game);
        Component[] comp = boardFrame.getContentPane().getComponents();
        JButton button = (JButton) comp[2];
        assertEquals(3, comp.length);
        ActionEvent event= new ActionEvent(button, 1001, "Turn Finish");
        barController.actionPerformed(event);
        comp = boardFrame.getContentPane().getComponents();
        assertEquals(4, comp.length);
        PlayerStatus playerStatus = (PlayerStatus) comp[3];
        playerStatus.setPanels(resourcePanel, sciencePanel);
        assertEquals(9, playerStatus.getComponentCount());

   }

}
