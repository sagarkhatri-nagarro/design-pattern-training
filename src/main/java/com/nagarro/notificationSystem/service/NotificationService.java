/**
 * 
 */
package main.java.com.nagarro.notificationSystem.service;
import java.util.ArrayList;
import java.util.List;
import main.java.com.nagarro.notificationSystem.impl.User;
import main.java.com.nagarro.notificationSystem.dao.NotificationSubscriber;
import main.java.com.nagarro.notificationSystem.dao.NotificationChannel;
import main.java.com.nagarro.notificationSystem.dao.NotificationFactory;
/**
 * @author sagarkhatri
 *
 */

public class NotificationService {
    private List<NotificationSubscriber> subscribers = new ArrayList<>();
    private NotificationFactory notificationFactory;

    public NotificationService(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public void subscribe(NotificationSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @SuppressWarnings("unused")
	public void sendNotification(String channelType, String subject, String message) {
        
		NotificationChannel channel = notificationFactory.createChannel(channelType);
		
        // Simulate getting subscribers from a mocked database
        List<NotificationSubscriber> subscribersList = getSubscribersFromDatabase();
        for (NotificationSubscriber subscriber : subscribersList) {
            subscriber.update(subject, message);
        }
    }

    private List<NotificationSubscriber> getSubscribersFromDatabase() {
        // Simulate getting subscribers from a database
        // This could be hard coded or mocked for demonstration purposes
        List<NotificationSubscriber> subscribersList = new ArrayList<>();
        
        return subscribersList;
    }
}
