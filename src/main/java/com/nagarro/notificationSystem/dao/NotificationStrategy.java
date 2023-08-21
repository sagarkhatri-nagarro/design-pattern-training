/**
 * 
 */
package main.java.com.nagarro.notificationSystem.dao;

/**
 * @author sagarkhatri
 *
 */
public interface NotificationStrategy {
    void sendNotification(String recipient, String subject, String message);
}