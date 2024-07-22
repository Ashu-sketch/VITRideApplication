package com.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String userID;
    private String contactInformation;

    // Constructor
    public User(String userName, String userID, String contactInformation) {
        this.userName = userName;
        this.userID = userID;
        this.contactInformation = contactInformation;
    }

    public User() {
		
	}

	public User(String userID) {
		this.userID=userID;
	}

	// Getters and setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    // User-related functionalities
    // Method to register a new user
    public static void registerUser(String userName, String userID, String contactInformation, List<User> users) {
        User newUser = new User(userName, userID, contactInformation);
        users.add(newUser);
        System.out.println("User registered successfully.");
    }

    // Method to remove a user
    public static void removeUser(String userID, List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserID().equals(userID)) {
                users.remove(i);
                System.out.println("User removed successfully.");
                return;
            }
        }
        System.out.println("User with ID " + userID + " not found.");
    }

    // Method to display all users
    public static void displayAllUsers(List<User> users) {
        System.out.println("List of all users:");
        for (User user : users) {
            System.out.println("Name: " + user.getUserName() + ", ID: " + user.getUserID() + ", Contact: " + user.getContactInformation());
        }
    }
}
