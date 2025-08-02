package patterns.Observer.observer;

import patterns.Observer.observable.Observable;

public class EmailUserObserver implements Observer{
    private String email;
    private Observable observable;

    public EmailUserObserver(String email, Observable observable){
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void notifyUser() {

        System.out.println("user has been notified via email");
    }
}
