/**
 * 
 */
package main.java.com.nagarro.notificationSystem.impl;

import main.java.com.nagarro.notificationSystem.dao.NotificationFactory;
import main.java.com.nagarro.notificationSystem.dao.NotificationChannel;
/**
 * @author sagarkhatri
 *
 */
public class NotificationFactoryImpl implements NotificationFactory {
    @Override
    public NotificationChannel createChannel(String channelType) {
        if ("email".equalsIgnoreCase(channelType)) {
            return EmailChannel.getInstance();
        } else if ("sms".equalsIgnoreCase(channelType)) {
            return SMSChannel.getInstance();
        }
        return null;
    }
}

