package com.model;

public class Driver {

	  private String driverName;
	  private String licenseNumber;
	  private String vehicleInformation;

	  // Constructors
	  public Driver(String driverName, String licenseNumber, String vehicleInformation) {
	    this.driverName = driverName;
	    this.licenseNumber = licenseNumber;
	    this.vehicleInformation = vehicleInformation;
	  }

	  public Driver() {
	    this("", "", ""); // Empty constructor for flexibility
	  }

	  // Getters
	  public String getDriverName() {
	    return driverName;
	  }

	  public String getLicenseNumber() {
	    return licenseNumber;
	  }

	  public String getVehicleInformation() {
	    return vehicleInformation;
	  }

	  // Setters
	  public void setName(String name) {
	    this.driverName = name;
	  }

	  public void setLicenseNumber(String licenseNumber) {
	    this.licenseNumber = licenseNumber;
	  }

	  public void setVehicleInformation(String vehicleInformation) {
	    this.vehicleInformation = vehicleInformation;
	  }

	  // Driver-related functionalities (example)
	  public void register(String registrationDetails) {
	    // Implement registration logic using registrationDetails
	    System.out.println("Driver " + driverName + " successfully registered. Details: " + registrationDetails);
	  }

	  public void removeRegistration() {
	    // Implement logic to remove registration
	    System.out.println("Driver " + driverName + " registration removed.");
	  }

	  public void displayDetails() {
	    System.out.println("Name: " + driverName);
	    System.out.println("License Number: " + licenseNumber);
	    System.out.println("Vehicle Information: " + vehicleInformation);
	  }

	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setAvailable(boolean b) {
		// TODO Auto-generated method stub
		
	}
	}