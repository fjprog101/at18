package jalau.at18.kingoftokyo.model;

import java.util.ArrayList;

public class TokyoCity extends Board implements Subject {
    private Monster monsterInsideTokyo;
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
            monsterInsideTokyo = player.getMonster();
            monsterInside = true;
        }
        notifyObservers();
    }

    @Override
    public void removeMonster() {
        if (monsterInside) {
            monsterInsideTokyo = null;
            monsterInside = false;
        }
    }

    @Override
    public Monster getMonster() {
        return monsterInsideTokyo;
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
