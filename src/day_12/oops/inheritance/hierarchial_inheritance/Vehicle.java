package day_12.oops.inheritance.hierarchial_inheritance;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	Vehicle(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable)
	{
		this.vehicleNumber= vehicleNumber;
		this.brand=brand;
		this.model=model;
		this.rentalPricePerDay=rentalPricePerDay;
		this.isAvailable=isAvailable;
	}
	public void displayDetails()
	{
		System.out.println("Vehicle Number: "+vehicleNumber+"\nBrand: "+brand+"\nModel: "+model+"\nRental Price Per Day : "+rentalPricePerDay);
		
	}
	public void rentVehicle()
	{
		if(isAvailable)
		{
			System.out.println("Vehicle is rented.\nThe rent of this Vehicle is : "+rentalPricePerDay+"\n");
		}
		else
		{
			System.out.println("This vehicle is not available for rent.\n");
		}
	}
	

}
