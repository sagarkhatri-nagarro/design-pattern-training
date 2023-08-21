/**
 * 
 */
package main.java.com.nagarro.notificationSystem.config;

import main.java.com.nagarro.notificationSystem.service.NotificationService;
import main.java.com.nagarro.notificationSystem.dao.NotificationFactory;
/**
 * @author sagarkhatri
 *
 */
public class NotificationConfig {
    private NotificationService notificationService;

    public NotificationConfig(NotificationFactory factory) {
        this.notificationService = new NotificationService(factory);
    }

    public void sendNotification(String channelType, String subject, String message) {
        notificationService.sendNotification(channelType, subject, message);
    }
}

