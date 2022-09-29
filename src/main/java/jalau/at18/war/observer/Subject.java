package jalau.at18.war.observer;

public interface Subject {
    void addObserver(Observer observer);
    void notifyObservers();
}
