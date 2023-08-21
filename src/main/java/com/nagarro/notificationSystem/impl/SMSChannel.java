/**
 * 
 */
package main.java.com.nagarro.notificationSystem.impl;

import main.java.com.nagarro.notificationSystem.dao.NotificationChannel;
/**
 * @author sagarkhatri
 *
 */
public class SMSChannel implements NotificationChannel {
    private static SMSChannel instance;

    private SMSChannel() {}

    public static synchronized SMSChannel getInstance() {
        if (instance == null) {
            instance = new SMSChannel();
        }
        return instance;
    }

    @Override
    public void sendNotification(String recipient, String subject, String message) {
        // Simulate sending an SMS notification
        System.out.println("Sending SMS to: " + recipient);
        System.out.println("Message: " + message);
    }
}
