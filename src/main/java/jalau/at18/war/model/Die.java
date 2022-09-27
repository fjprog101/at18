package jalau.at18.war.model;

import java.util.ArrayList;
import java.util.List;

import jalau.at18.war.observer.Observer;
import jalau.at18.war.observer.Subject;

public class Die implements Subject {

    private List<Observer> observers;
    private DieFace currentFace;

    public Die(DieFace face) {
        currentFace = face;
        observers = new ArrayList<Observer>();
    }

    public void setFace(DieFace newFace) {
        currentFace = newFace;
        notifyObservers();
    }

    public DieFace getFace() {
        return currentFace;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }
}
