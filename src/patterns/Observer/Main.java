package patterns.Observer;

import patterns.Observer.observable.IphoneStockObservable;
import patterns.Observer.observable.Observable;
import patterns.Observer.observer.EmailUserObserver;
import patterns.Observer.observer.MobileUserObserver;

public class Main {
    public static void main(String[] args) {
        Observable iphoneStockObservable = new IphoneStockObservable();
        MobileUserObserver mobileUserObserver1 = new MobileUserObserver("nithin", "987654321", iphoneStockObservable);
        MobileUserObserver mobileUserObserver2 = new MobileUserObserver("Amit", "6346", iphoneStockObservable);
        EmailUserObserver emailUserObserver1 = new EmailUserObserver("abc@gmail", iphoneStockObservable);

        iphoneStockObservable.add(mobileUserObserver1);
        iphoneStockObservable.add(emailUserObserver1);
        iphoneStockObservable.add(mobileUserObserver2);

        System.out.println(iphoneStockObservable.getCount());
        iphoneStockObservable.setCount(10);
        System.out.println(iphoneStockObservable.getCount());
        iphoneStockObservable.setCount(45);
        System.out.println(iphoneStockObservable.getCount());
    }
}
