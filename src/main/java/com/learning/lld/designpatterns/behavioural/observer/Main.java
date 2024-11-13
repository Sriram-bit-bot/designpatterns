package com.learning.lld.designpatterns.behavioural.observer;

import com.learning.lld.designpatterns.behavioural.observer.observeable.IphoneObserveableImpl;

public class Main {
    public static void main(String[] args) {
        IphoneObserveableImpl phone1 =new IphoneObserveableImpl();
        EmailNotificationObserverImpl e1 =new EmailNotificationObserverImpl(phone1, "sriramsaravanakumar@gmail.com");
        EmailNotificationObserverImpl e2 =new EmailNotificationObserverImpl(phone1, "sriramsaravanakumar7@gmail.com");
        MobileNotificationObserverImpl m1 = new MobileNotificationObserverImpl(phone1, "18293791823");

        phone1.add(e1);
        phone1.add(e2);
        phone1.add(m1);

        phone1.addStock(10);
        phone1.addStock(20);
    }
}
