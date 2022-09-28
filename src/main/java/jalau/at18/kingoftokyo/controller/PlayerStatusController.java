package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.Turn;
import jalau.at18.kingoftokyo.view.GameFrame;

public class PlayerStatusController {
    private static final int HEAL = 0;
    private static final int DAMAGE = 1;
    private static final int SCORE = 2;
    private static final int ENERGY = 3;
    private Turn turn;
    public PlayerStatusController(GameFrame gameFrame) {
        this.turn = gameFrame.getTurns();
    }

    public void setPlayersStatus(int[] effect) {
        setPlayerWithTurn(effect[HEAL], effect[SCORE], effect[ENERGY]);
        giveDamage(effect[DAMAGE]);
    }

    public void setPlayerWithTurn(int healing, int victoryPoints, int energy) {
        int newLifePoints = turn.getPlayerWithTheTurn().getLifePoints() + healing;
        int newVictoryPoints = turn.getPlayerWithTheTurn().getVictoryPoints() + victoryPoints;
        int newEnery = turn.getPlayerWithTheTurn().getEnergy() + energy;
        turn.getPlayerWithTheTurn().setLifePoints(newLifePoints);
        turn.getPlayerWithTheTurn().setVictoryPoints(newVictoryPoints);
        turn.getPlayerWithTheTurn().setEnergy(newEnery);
    }

    public void giveDamage(int damage) {
        for (Player player : turn.getPlayersList()) {
            if (player != turn.getPlayerWithTheTurn()) {
                int newLifePoints = player.getLifePoints() - damage;
                player.setLifePoints(newLifePoints);
            }
        }
    }
}