package jalau.at18.kingoftokyo.controller;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import jalau.at18.kingoftokyo.model.CompleteCard;
import jalau.at18.kingoftokyo.model.DiscardCards;
import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.Turn;
import jalau.at18.kingoftokyo.view.card.CardPanel;

public class BuyCardButtonControllerTest {
    @Test
    public void shouldSayIfPlayerHasEnoughtEnergy() {
        Player player1 = new Player();
        player1.addMonster(Monster.ALIENOID);
        Player player2 = new Player();
        player2.addMonster(Monster.CYBER_KITTY);
        player2.setEnergy(8);
        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(player1);
        playerList.add(player1);
        Turn turn = new Turn(playerList);

        CardPanel cardPanel = new CardPanel(turn, new CompleteCard(DiscardCards.ENERGIZE));
        BuyCardButtomController buyController = new BuyCardButtomController(turn, cardPanel);

        assertFalse(buyController.enoughEnergy());
        turn.changePlayerWithTheTurn();
        assertTrue(buyController.enoughEnergy());
    }
    @Test
    public void shouldSetCardPanel() {
        Player player1 = new Player();
        player1.addMonster(Monster.ALIENOID);
        Player player2 = new Player();
        player2.addMonster(Monster.CYBER_KITTY);
        player2.setEnergy(8);
        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(player1);
        playerList.add(player1);
        Turn turn = new Turn(playerList);

        CardPanel cardPanel = new CardPanel(turn, new CompleteCard(DiscardCards.ENERGIZE));
        BuyCardButtomController buyController = new BuyCardButtomController(turn, cardPanel);

        assertFalse(buyController.enoughEnergy());
        turn.changePlayerWithTheTurn();
        assertTrue(buyController.enoughEnergy());
    }
}
