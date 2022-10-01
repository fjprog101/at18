package jalau.at18.kingoftokyo.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import jalau.at18.kingoftokyo.view.card.CardNameLabel;

public class DialogsControllerTest {
    @Test
    public void shouldSetPlayerStatus()  {
            String name ="name";
            CardNameLabel  cardNameLabel = new CardNameLabel(name);
            DialogsController dialogsController = new DialogsController();
            assertTrue(dialogsController.confirmBuyDialogResult(cardNameLabel));

    }
}
