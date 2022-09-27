package jalau.at18.kingoftokyo.model;

import jalau.at18.kingoftokyo.view.playercards.PlayerCard;

public class Player {
    private static final int TEN = 10;
    private Monster monster;
    private int energy;
    private int lifePoints;
    private int victoryPoints;

    private PlayerCard subscriber;

    public Player() {
        this.monster = null;
        this.energy = 0;
        this.lifePoints = TEN;
        this.victoryPoints = 0;
    }
    public void addMonster(Monster newMonster) {
        this.monster = newMonster;
    }
    public Monster getMonster() {
        return this.monster;
    }
    public int getEnergy() {
        return this.energy;
    }
    public int getLifePoints() {
        return this.lifePoints;
    }
    public int getVictoryPoints() {
        return this.victoryPoints;
    }
    public void setEnergy(int newEnergy) {
        this.energy = newEnergy;
        subscriber.updatePlayerStatus();
    }
    public void setLifePoints(int newLifePoints) {
        this.lifePoints = newLifePoints;
        subscriber.updatePlayerStatus();
    }
    public void setVictoryPoints(int newVictoryPoints) {
        this.victoryPoints = newVictoryPoints;
        subscriber.updatePlayerStatus();
    }
    public void addSubscriber(PlayerCard newSubscriber) {
        this.subscriber = newSubscriber;
    }
}
