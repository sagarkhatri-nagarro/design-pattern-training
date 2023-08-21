/**
 * 
 */
package main.java.com.nagarro.notificationSystem.impl;

import main.java.com.nagarro.notificationSystem.dao.NotificationSubscriber;
/**
 * @author sagarkhatri
 *
 */
public class User implements NotificationSubscriber {
    private String name;
    private String email;
    private String phoneNumber;

    public User(String name, String email, String phoneNumber) {
        this.setName(name);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
    }

    @Override
    public void update(String subject, String message) {
        System.out.println("Notification received by " + name);
        // Process and handle the notification details
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
