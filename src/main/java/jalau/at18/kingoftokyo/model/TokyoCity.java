package jalau.at18.kingoftokyo.model;

import java.util.ArrayList;

public class TokyoCity extends Board implements Subject {
    private Player playerInsideTokyo;
    private boolean monsterInside;
    private ArrayList<Observer> observers;

    public TokyoCity() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public boolean thereIsMonsterInside() {
        return monsterInside;
    }

    @Override
    public void addMonster(Player player) {
        if (!monsterInside) {
            playerInsideTokyo = player;
            monsterInside = true;
        }
        notifyObservers();
    }

    @Override
    public void removeMonster() {
        if (monsterInside) {
            playerInsideTokyo = null;
            monsterInside = false;
        }
    }

    @Override
    public Player getPlayer() {
        return playerInsideTokyo;
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
