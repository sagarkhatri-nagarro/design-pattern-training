/**
 * 
 */
package main.java.com.nagarro.notificationSystem.impl;

import main.java.com.nagarro.notificationSystem.dao.NotificationChannel;

/**
 * @author sagarkhatri
 *
 */
public class EmailChannel implements NotificationChannel {
    private static EmailChannel instance;

    private EmailChannel() {}

    public static synchronized EmailChannel getInstance() {
        if (instance == null) {
            instance = new EmailChannel();
        }
        return instance;
    }

    @Override
    public void sendNotification(String recipient, String subject, String message) {
        // Simulate sending an email notification
        System.out.println("Sending email to: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
    }
}

