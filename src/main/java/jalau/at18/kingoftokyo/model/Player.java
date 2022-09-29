package jalau.at18.kingoftokyo.model;

import java.util.ArrayList;

public class Player implements Subject {
    private static final int TEN = 10;
    private String userName;
    private Monster monster;
    private int energy;
    private int lifePoints;
    private int victoryPoints;

    private ArrayList<Observer> observers;

    public Player() {
        this.monster = null;
        this.energy = 0;
        this.lifePoints = TEN;
        this.victoryPoints = 0;
        observers = new ArrayList<Observer>();
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
        notifyObservers();
    }
    public void setLifePoints(int newLifePoints) {
        this.lifePoints = newLifePoints;
        notifyObservers();
    }
    public void setVictoryPoints(int newVictoryPoints) {
        this.victoryPoints = newVictoryPoints;
        notifyObservers();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void setMonster(Monster monsterObj) {
        this.monster = monsterObj;
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
