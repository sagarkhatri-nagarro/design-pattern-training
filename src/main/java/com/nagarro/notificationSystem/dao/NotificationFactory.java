/**
 * 
 */
package main.java.com.nagarro.notificationSystem.dao;

/**
 * @author sagarkhatri
 *
 */
public interface NotificationFactory {
    NotificationChannel createChannel(String channelType);
}

