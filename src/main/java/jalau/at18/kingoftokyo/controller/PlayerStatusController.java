package jalau.at18.kingoftokyo.controller;

import java.util.ArrayList;
import jalau.at18.kingoftokyo.model.Observer;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.Subject;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import jalau.at18.kingoftokyo.model.TokyoCity;
import jalau.at18.kingoftokyo.model.Turn;

public class PlayerStatusController implements Subject {
    private static final int MAX_LIFE = 10;
    private static final int MIN_LIFE = 0;
    private static final int MAX_VICTORY = 20;
    private static final int HEAL = 0;
    private static final int DAMAGE = 1;
    private static final int SCORE = 2;
    private static final int ENERGY = 3;
    private Turn turn;
    private ArrayList<Observer> observers;
    private TokyoCity tokyoCity;

    public PlayerStatusController(Turn turn, TokyoCity tokyoCity) {
        this.turn = turn;
        this.tokyoCity = tokyoCity;
        observers = new ArrayList<Observer>();
    }

    public void setPlayersStatus(int[] effect) {
        setPlayerWithTurn(effect[HEAL], effect[SCORE], effect[ENERGY]);
        giveDamage(effect[DAMAGE]);
        notifyObservers();
    }

    public void setPlayerWithTurn(int healing, int victoryPoints, int energy) {
        int newEnergy = turn.getPlayerWithTheTurn().getEnergy() + energy;
        turn.getPlayerWithTheTurn().setLifePoints(changeLifePoints(turn.getPlayerWithTheTurn(), healing, 1));
        turn.getPlayerWithTheTurn().setVictoryPoints(changeVictoryPoints(victoryPoints));
        turn.getPlayerWithTheTurn().setEnergy(newEnergy);
    }

    public void giveDamage(int damage) {
        if (turn.getPlayerWithTheTurn().getMonster() == tokyoCity.getMonster()) {
            for (Player player : turn.getPlayersList()) {
                if (player != turn.getPlayerWithTheTurn()) {
                    player.setLifePoints(changeLifePoints(player, damage, -1));
                }
            }
        } else {
            for (Player player : turn.getPlayersList()) {
                if (player.getMonster() == tokyoCity.getMonster() && damage != 0
                        && turn.getPlayerWithTheTurn() != player) {
                    player.setLifePoints(changeLifePoints(player, damage, -1));
                    JLabel label = new JLabel(
                            player.getUserName() + " Your monster was injured, do you want to leave TokyoCity?");
                    int result = JOptionPane.showConfirmDialog(null, label, "You were attacked",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (result == JOptionPane.YES_OPTION) {
                        tokyoCity.removeMonster();
                        tokyoCity.addMonster(turn.getPlayerWithTheTurn());
                    }
                }
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

    public int changeVictoryPoints(int victoryPoints) {
        int newVictoryPoints = turn.getPlayerWithTheTurn().getVictoryPoints();
        while (newVictoryPoints < MAX_VICTORY && victoryPoints > 0) {
            newVictoryPoints++;
            victoryPoints--;
        }
        return newVictoryPoints;
    }

    public Turn getTurn() {
        return turn;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}