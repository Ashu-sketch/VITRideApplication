package com.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RideManager {

    private List<User> users;
    private List<Driver> drivers;
    private List<Ride> ongoingRides;
    private List<Ride> rideHistory;

    public RideManager() {
        this.users = new ArrayList<>();
        this.drivers = new ArrayList<>();
        this.ongoingRides = new ArrayList<>();
        this.rideHistory = new ArrayList<>();
    }

    // User Management

    public void registerUser(User user) {
        users.add(user);
        
    }

    public void removeUser(User user) {
    	
    	String userIDToRemove = user.getUserID();
        for (Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
            User currentUser = iterator.next();
            if (currentUser.getUserID().equals(userIDToRemove)) {
                iterator.remove(); // Remove the user from the list
                break; // Break out of the loop once user is removed
            }
        }
    }

    public List<User> getUsers() {
    	
        return Collections.unmodifiableList(users); // Return unmodifiable list for safety
    }

    public void displayUsers() {
        System.out.println("Registered Users:");
//        RideManager m=new RideManager();
//      User userList=  (User) m.getUsers();
        int count=1;
        for (User user : users) {
        	
        	System.out.println(count+ ".User Name: " +user.getUserName());
            System.out.println("user Id "+user.getUserID());           
            System.out.println("contact info :" +user.getContactInformation());
            System.out.println(); 
            
            //count variable for counting all the users with number for better understanding
            count++;
          
        }
    }

    // Driver Management

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public void removeDriver(Driver driver) {
//        drivers.remove(driver);
    	String licenceNumber = driver.getLicenseNumber();
        for (Iterator<Driver> iterator = drivers.iterator(); 
        		iterator.hasNext();) {
            Driver currentUser = iterator.next();
            if (currentUser.getLicenseNumber().equals(licenceNumber)) {
                iterator.remove(); // Remove the user from the list
                break; // Break out of the loop once user is removed
            }
        }
    }

    public List<Driver> getDrivers() {
        return Collections.unmodifiableList(drivers); // Return unmodifiable list for safety
    }

    public void displayDrivers() {
        System.out.println("Registered Drivers:");
        int count=1;
        for (Driver driver : drivers) {
            System.out.println(count+". Driver Name :"+driver.getDriverName());
            System.out.println("Licence Number :"+driver.getLicenseNumber());
            System.out.println("Vehicle Number :"+driver.getVehicleInformation());
            System.out.println();
            count++;
            
        }
    }

    // Ride Management

    public void requestRide(User user,  String currentLocation, String desiredLocation ) {
//    	RideManager rideManager=new RideManager();
    	
        Ride ride = new Ride(user,currentLocation,desiredLocation );
        ongoingRides.add(ride);
//        allocateDriver(rideManager, ride);
        System.out.println("Your ride has been confiremed");
    }

    public void allocateDriver(RideManager manager, Ride ride) {
        // Implement logic to find an available driver and assign them to the ride
        // This could involve iterating through the drivers list and checking their availability
        // For simplicity, this example randomly assigns an available driver
//    	RideManager manager=new RideManager();
    	Driver Alldrivers= (Driver) manager.getDrivers();
        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                ride.setDriver(driver);
                driver.setAvailable(false); // Mark driver as unavailable
                System.out.println("Driver " + driver.getDriverName() + " assigned to ride.");
                return;
            }
        }
        System.out.println("No available driver found for ride.");
    }
    
    public void ongoingRides() {
    	
System.out.println("ongoing rides:");
int count=1;
for (Ride ride : ongoingRides) {
    System.out.println(count+". :"+ride.getUser().getUserName());
    System.out.println("location :"+ride.getCurrentLocation());
    System.out.println("destination :"+ride.getDestination());
    System.out.println();
    count++;
    
}
        }
    	    
    public void completeRide(Ride ride) {
        ongoingRides.remove(ride);
        rideHistory.add(ride);
        // Update driver availability and potentially calculate fare
    }

    public List<Ride> getRideHistory() {
        return Collections.unmodifiableList(rideHistory); // Return unmodifiable list for safety
    }

    public void displayRideHistory() {
    	RideManager rideManager=new RideManager();
//    	rideManager.completeRide(ride);
        System.out.println("Ride History:");
        for (Ride ride : rideHistory) {
            System.out.println(ride);
        }
    }
}
