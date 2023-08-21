/**
 * 
 */
package main.java.com.nagarro.notificationSystem.dao;

/**
 * @author sagarkhatri
 *
 */
public interface NotificationChannel {
    void sendNotification(String recipient, String subject, String message);
}
