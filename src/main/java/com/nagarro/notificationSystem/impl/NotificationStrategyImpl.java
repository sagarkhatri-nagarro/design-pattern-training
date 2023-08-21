/**
 * 
 */
package main.java.com.nagarro.notificationSystem.impl;

import main.java.com.nagarro.notificationSystem.dao.NotificationStrategy;
import main.java.com.nagarro.notificationSystem.dao.NotificationChannel;
/**
 * @author sagarkhatri
 *
 */
public class NotificationStrategyImpl implements NotificationStrategy {
    private NotificationChannel channel;

    public NotificationStrategyImpl(NotificationChannel channel) {
        this.channel = channel;
    }

    @Override
    public void sendNotification(String recipient, String subject, String message) {
        channel.sendNotification(recipient, subject, message);
    }
}
