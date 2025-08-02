package patterns.Observer.observer;

import patterns.Observer.observable.Observable;

public class MobileUserObserver implements Observer{

    private String userName;
    private String mobile;
    private Observable observable;

    public MobileUserObserver(String userName, String mobile, Observable observable){
        this.mobile = mobile;
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void notifyUser() {
        System.out.println("User has been notified via mobile to -> " + userName + "mobile ->" + mobile);
    }
}
