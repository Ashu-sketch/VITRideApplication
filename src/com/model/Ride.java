package com.model;

public class Ride {
    private User user;
    private Driver driver;
    private String currentLocation;
    private String destination;
    private String status;

    // Constructor
    public Ride(User user, Driver driver, String currentLocation, String destination, String status) {
        this.user = user;
        this.driver = driver;
        this.currentLocation = currentLocation;
        this.destination = destination;
        this.status = status;
    }

    public Ride(User user,  String destination) {
		this.user=user;
		this.destination=destination;
	}

	public Ride( User user, String currentLocation, String destination) {
	this.currentLocation=currentLocation;
	this.destination=destination;
	this.user=user;
	
	}

	

	public Ride() {}

	// Getters and setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method for requesting a ride
    public void requestRide(User user, String destination) {
        // Logic for requesting a ride
    }

    // Method for allocating a driver to the ride
    public void allocateDriver(Driver driver) {
        // Logic for allocating a driver to the ride
    }

    // Method for displaying ride information
    public void displayRideInfo() {
        System.out.println("Ride Information:");
        System.out.println("User: " + user.getUserName());
        System.out.println("Driver: " + driver.getDriverName ());
        System.out.println("Current Location: " + currentLocation);
        System.out.println("Destination: " + destination);
        System.out.println("Status: " + status);
    }
}

