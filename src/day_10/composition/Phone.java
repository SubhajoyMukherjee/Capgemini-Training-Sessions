package day_10.composition;

public class Phone {
	String phoneName;
	Battery b;
	Phone(String phoneName, String batteryType)
	{
		this.phoneName=phoneName;
		this.b=new Battery(batteryType);
	}

}
