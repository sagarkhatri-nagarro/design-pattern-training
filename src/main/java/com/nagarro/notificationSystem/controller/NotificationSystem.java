/**
 * 
 */
package main.java.com.nagarro.notificationSystem.controller;

import main.java.com.nagarro.notificationSystem.config.NotificationConfig;
import main.java.com.nagarro.notificationSystem.dao.NotificationFactory;
import main.java.com.nagarro.notificationSystem.dao.NotificationSubscriber;
import main.java.com.nagarro.notificationSystem.impl.NotificationFactoryImpl;
import main.java.com.nagarro.notificationSystem.impl.User;
import main.java.com.nagarro.notificationSystem.service.NotificationService;

/**
 * @author sagarkhatri
 *
 */
public class NotificationSystem {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // Create a factory for creating notification channels
        NotificationFactory factory = new NotificationFactoryImpl();
        
        // Create instances of subscribers (users)
        NotificationSubscriber user1 = new User("Sagar", "sagar@nagarro.com", "1234567890");
        NotificationSubscriber user2 = new User("Sagar", "sagar@gmail.com", "9876543210");
        NotificationSubscriber user3 = new User("Sagar", "sgaar@gmail.com", "1234567800");
        NotificationSubscriber user4 = new User("Gurpreet", "gurpreet@gmail.com", "1234567890");
        NotificationSubscriber user5 = new User("Vivek", "vivek@gmail.com", "1234567890");
        NotificationSubscriber user6 = new User("Vijey", "vijay@gmail.com", "9876543210");
        // Subscribe users to the notification service
        NotificationService notificationService = new NotificationService(factory);
        notificationService.subscribe(user1);
        notificationService.subscribe(user2);
        notificationService.subscribe(user3);
        notificationService.subscribe(user4);
        notificationService.subscribe(user5);
        notificationService.subscribe(user6);        
        // Create a config to simplify notification sending
        NotificationConfig notificationConfig = new NotificationConfig(factory);
        
        // Send notifications using the config
        notificationConfig.sendNotification("email", "Important Update", "First email");
        notificationConfig.sendNotification("sms", "Urgent Alert", "First SMS");
    }
}
