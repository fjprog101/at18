package jalau.at18.kingoftokyo.model;

public interface Subject {
    void addObserver(Observer observer);
    void notifyObservers();
}
