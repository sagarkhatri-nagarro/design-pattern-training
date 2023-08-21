/**
 * 
 */
package main.java.com.nagarro.notificationSystem.dao;

/**
 * @author sagarkhatri
 *
 */
public interface NotificationObserver {
    void update(String subject, String message);
}
