package com.learning.lld.designpatterns.behavioural.observer;

import com.learning.lld.designpatterns.behavioural.observer.observeable.StockObservable;

public class EmailNotificationObserverImpl implements NotificationObserver{

    StockObservable observable;
    String emailId;

    public EmailNotificationObserverImpl(StockObservable observable, String email){
        this.observable =observable;
        this.emailId =email;
    }
    @Override
    public void update() {
        System.out.println("Sending Email: stock available ");
    }
}
