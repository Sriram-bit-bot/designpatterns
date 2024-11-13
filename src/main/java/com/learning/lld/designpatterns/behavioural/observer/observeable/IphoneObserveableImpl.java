package com.learning.lld.designpatterns.behavioural.observer.observeable;

import com.learning.lld.designpatterns.behavioural.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObserveableImpl implements StockObservable{
    int stock =0;
    List<NotificationObserver> observerList =new ArrayList<>();

    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void addStock(int stock) {
        if(this.stock == 0){
            notifySubscribers();
        }
        this.stock += stock;
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver notificationObserver : observerList){
            notificationObserver.update();
        }
    }
}
