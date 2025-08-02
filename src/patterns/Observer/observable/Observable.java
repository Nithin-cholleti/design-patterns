package patterns.Observer.observable;

import patterns.Observer.observer.Observer;

import java.util.List;

public interface Observable {

    void add(Observer observer);
    void remove(Observer observer);
    void notifyObserver();
    void setCount(int count);
    int getCount();
}
