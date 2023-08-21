/**
 * 
 */
package main.java.com.nagarro.notificationSystem.dao;

/**
 * @author sagarkhatri
 *
 */
public interface NotificationSubscriber {
    void update(String subject, String message);
}

