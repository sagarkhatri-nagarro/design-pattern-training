/**
 * 
 */
package main.java.com.nagarro.notificationSystem.impl;
import java.util.ArrayList;
import java.util.List;
import main.java.com.nagarro.notificationSystem.dao.NotificationObserver;
/**
 * @author sagarkhatri
 *
 */
public class NotificationPublisher {
    private List<NotificationObserver> observers = new ArrayList<>();

    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String subject, String message) {
        for (NotificationObserver observer : observers) {
            observer.update(subject, message);
        }
    }
}

