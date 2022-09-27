package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.Player;
import jalau.at18.kingoftokyo.Turn;
import jalau.at18.kingoftokyo.view.GameFrame;

public class PlayerStatusController {
    private static final int HEAL = 0;
    private static final int DAMAGE = 1;
    private static final int SCORE = 2;
    private static final int ENERGY = 3;
    private GameFrame gameFrame;
    private Turn turn;
    public PlayerStatusController(GameFrame gameFrame, Turn turn) {
        this.gameFrame = gameFrame;
        this.turn = turn;
    }

    public void setPlayerStatus(int[] effect) {
        setHealing(effect[HEAL]);
        giveDamage(effect[DAMAGE]);
        setVictoryPoints(effect[SCORE]);
        setEnergy(effect[ENERGY]);

    }
    public void setHealing(int healing) {
        int newLifePoints = turn.getPlayerWithTheTurn().getMonster().getLifePoints() + healing;
        turn.getPlayerWithTheTurn().getMonster().setLifePoints(newLifePoints);
    }
    public void giveDamage(int damage) {
        for (Player player : turn.getPlayersList()) {
            if (player != turn.getPlayerWithTheTurn()) {
                int newLifePoints = player.getMonster().getLifePoints() - damage;
                player.getMonster().setLifePoints(newLifePoints);
            }
        }
    }
    public void setVictoryPoints(int victoryPoints) {
        int newVictoryPoints = turn.getPlayerWithTheTurn().getMonster().getVictoryPoints() + victoryPoints;
        turn.getPlayerWithTheTurn().getMonster().setVictoryPoints(newVictoryPoints);
    }
    public void setEnergy(int energy) {
        int newEnery = turn.getPlayerWithTheTurn().getEnergy() + energy;
        turn.getPlayerWithTheTurn().setEnergy(newEnery);
    }
}
