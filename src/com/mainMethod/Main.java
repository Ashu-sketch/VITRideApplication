package com.mainMethod;

import java.util.Scanner;

import com.model.Driver;
import com.model.Ride;
import com.model.RideManager;
import com.model.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RideManager rideManager = new RideManager();
        Ride ride=new Ride();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("11. Register New Users");
            System.out.println("12. Remove Users");
            System.out.println("13. Display All Users");
            System.out.println("14. Register New Drivers");
            System.out.println("15. Remove Drivers");
            System.out.println("16. Display All Drivers");
            System.out.println("17. Request a Ride");
            System.out.println("18. Allocate Drivers to Rides");
            System.out.println("19. Display Ongoing Rides");
            System.out.println("20. Display Ride History");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 11:
                    registerNewUser(rideManager, scanner);
                    break;
                case 12:
                    removeUser(rideManager, scanner);
                    break;
                case 13:
                    displayAllUsers(rideManager);
                    break;
                case 14:
                    registerNewDriver(rideManager, scanner);
                    break;
                case 15:
                    removeDriver(rideManager, scanner);
                    break;
                case 16:
                    displayAllDrivers(rideManager);
                    break;
                case 17:
                    requestRide(rideManager, scanner);
                    break;
                case 18:
                	allocateDriverToRides(rideManager, ride);;
                    break;
                case 19:
                    displayOngoingRides(rideManager);
                    break;
                case 20:
                    displayRideHistory(rideManager);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
    
    private static void registerNewUser(RideManager rideManager, Scanner scanner) {
        // Obtain user details
        System.out.println("Enter user name:");
        String name = scanner.next();
        System.out.println("Enter user ID:");
        String userID = scanner.next();
        System.out.println("Enter user contact information:");
        String contactInformation = scanner.next();
        User user= new User(name, userID, contactInformation);
        // Register new user
        rideManager.registerUser(user);
    }
    
    private static void removeUser(RideManager rideManager, Scanner scanner) {
        // Obtain user ID to remove
        System.out.println("Enter user ID to remove:");
        String userID = scanner.next();
        User user=new User(userID);
                    
        // Remove user
        rideManager.removeUser(user);
    }
    
    private static void displayAllUsers(RideManager rideManager) {     
        rideManager.displayUsers();
    }
    
    private static void registerNewDriver(RideManager rideManager, Scanner scanner) {
        // Obtain driver details
        System.out.println("Enter driver name:");
        String name = scanner.next();
        System.out.println("Enter driver license number:");
        String licenseNumber = scanner.next();
        System.out.println("Enter driver vehicle information:");
        String vehicleInformation = scanner.next();
        
        Driver driver =new Driver(name, licenseNumber, vehicleInformation);
        
        // Register new driver
        rideManager.registerDriver(driver);
        
    }
    
    private static void removeDriver(RideManager rideManager, Scanner scanner) {
        // Obtain driver license number to remove
        System.out.println("Enter driver license number to remove:");
        String licenseNumber = scanner.next();
        Driver driver=new Driver();
        driver.setLicenseNumber(licenseNumber);
        // Remove driver
        rideManager.removeDriver(driver);
    }
    
    private static void displayAllDrivers(RideManager rideManager) {
        rideManager.displayDrivers();
    }
    
    private static void requestRide(RideManager rideManager, Scanner scanner) {
        // Obtain ride details

    	
    	 System.out.println("Enter your Full Name:");
         String name = scanner.next();
         System.out.println("Enter your current location:");
         String currentLocation = scanner.next();
         System.out.println("Enter your destination:");
         String destination = scanner.next();
               
        
        User user=new User();
        user.setUserName(name);
        
        Ride ride=new Ride(user, currentLocation, destination);
        
        // Request a ride
        rideManager.requestRide(user, currentLocation, destination);
    }
    
    private static void allocateDriverToRides(RideManager rideManager, Ride ride) {
        // Implement driver allocation to rides
    	
    	
//      
    	rideManager.allocateDriver(rideManager, ride);
    }
    
    private static void displayOngoingRides(RideManager rideManager) {
       Ride ride=new Ride();
        rideManager.ongoingRides();
    }
    
    private static void displayRideHistory(RideManager rideManager) {
        // Display ride history
        rideManager.displayRideHistory();
    }
}
