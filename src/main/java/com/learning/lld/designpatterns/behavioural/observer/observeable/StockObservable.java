package com.learning.lld.designpatterns.behavioural.observer.observeable;

import com.learning.lld.designpatterns.behavioural.observer.EmailNotificationObserverImpl;
import com.learning.lld.designpatterns.behavioural.observer.NotificationObserver;

public interface StockObservable{
    void add(NotificationObserver observer);
    void remove(NotificationObserver observer);
    int getStock();
    void addStock(int stock);
    void notifySubscribers();
}
