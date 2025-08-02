package patterns.Observer.observable;

import patterns.Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements Observable{
    List<Observer> observers = new ArrayList<>();
    int cartValue = 0;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(){
        observers.forEach(Observer::notifyUser);
    }

    @Override
    public void setCount(int count){
        if(cartValue == 0){
            notifyObserver();
        }
        cartValue = cartValue + count;
    }
    @Override
    public int getCount(){return cartValue;}
}
