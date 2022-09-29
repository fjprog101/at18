package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.Turn;

public class PlayerStatusController {
    private static final int MAX_LIFE = 10;
    private static final int MIN_LIFE = 0;
    private static final int HEAL = 0;
    private static final int DAMAGE = 1;
    private static final int SCORE = 2;
    private static final int ENERGY = 3;
    private Turn turn;

    public PlayerStatusController(Turn turn) {
        this.turn = turn;
    }

    public void setPlayersStatus(int[] effect) {
        setPlayerWithTurn(effect[HEAL], effect[SCORE], effect[ENERGY]);
        giveDamage(effect[DAMAGE]);
    }

    public void setPlayerWithTurn(int healing, int victoryPoints, int energy) {
        int newVictoryPoints = turn.getPlayerWithTheTurn().getVictoryPoints() + victoryPoints;
        int newEnergy = turn.getPlayerWithTheTurn().getEnergy() + energy;
        turn.getPlayerWithTheTurn().setLifePoints(changeLifePoints(turn.getPlayerWithTheTurn(), healing, 1));
        turn.getPlayerWithTheTurn().setVictoryPoints(newVictoryPoints);
        turn.getPlayerWithTheTurn().setEnergy(newEnergy);
    }

    public void giveDamage(int damage) {
        for (Player player : turn.getPlayersList()) {
            if (player != turn.getPlayerWithTheTurn()) {
                player.setLifePoints(changeLifePoints(player, damage, -1));
            }
        }
    }

    public int changeLifePoints(Player player, int healing, int operator) {
        int newLifePoints = player.getLifePoints();
        while (newLifePoints <= MAX_LIFE && newLifePoints > MIN_LIFE && healing > 0) {
            newLifePoints += operator;
            healing--;
        }
        return newLifePoints == MAX_LIFE + 1 ? newLifePoints - 1 : newLifePoints;
    }

    public Turn getTurn() {
        return turn;
    }
}