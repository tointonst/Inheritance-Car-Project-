
public class Jeep extends SUV  {
	
	String engine = "V-8";
	
	
	public void interiorDesign()
	{
		System.out.println("The Jeep Grand Cheroke has a luxury interior with a touchscreen and heated seats.");
		
	}
	
	public void specs()
	{
		System.out.println("Jeep");
		System.out.println("This Jeep has a " + engine + "engine.");
		System.out.println("It also is 4 wheel drive.");
		myTurboCharged = (TurboCharged) new isTurboCharged();
		
	}
	
	public void canTow()
	{
		super.canTow();
		System.out.println("It can tow almost 7000 pounds.");
		
	}
	
	//public void offRoading()
	{
		System.out.println("This particilar jeep can go offrading but is limited to eaier places.");
	}

}
