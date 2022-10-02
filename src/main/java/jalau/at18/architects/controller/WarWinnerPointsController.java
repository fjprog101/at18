package jalau.at18.architects.controller;

import jalau.at18.architects.model.cards.WarWinnerPoints;

public class WarWinnerPointsController {
    private static final int TESTPOINT = 5;
    private WarWinnerPoints battle;
    public WarWinnerPointsController() {
        battle = new WarWinnerPoints();
        battle.setQuantityToken(TESTPOINT);
        battle.getPoints();
    }

    public int getWinnerPoints() {
        return this.battle.getPoints();
    }
}
