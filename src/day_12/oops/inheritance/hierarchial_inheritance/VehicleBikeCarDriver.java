package day_12.oops.inheritance.hierarchial_inheritance;

public class VehicleBikeCarDriver {
	public static void main(String[] args)
	{
		Bike b=new Bike("1234","Bajaj","Pulsar",200,true,true);
		Car c=new Car("WB 52 L 3351", "Mahindra", "Scorpio",1000.00,false,5);
		b.displayDetails();
		b.rentVehicle();
		c.displayDetails();
		c.rentVehicle();
	}

}
