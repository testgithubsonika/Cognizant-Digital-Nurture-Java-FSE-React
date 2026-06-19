package Week_1.Design_Patterns.Behavioral.ObserverPatternExample;

public interface Stock {

    void registerObserver(Observer observer);

    void deregisterObserver(Observer observer);

    void notifyObservers();
}
