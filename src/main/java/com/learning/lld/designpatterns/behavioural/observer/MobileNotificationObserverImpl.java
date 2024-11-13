package com.learning.lld.designpatterns.behavioural.observer;

import com.learning.lld.designpatterns.behavioural.observer.observeable.StockObservable;

public class MobileNotificationObserverImpl implements NotificationObserver{
    StockObservable observable;
    String mobileNo;

    public MobileNotificationObserverImpl(StockObservable stockObservable, String mobileNo){
        this.mobileNo =mobileNo;
        this.observable =stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Pushing notification: stock available ");
    }
}
