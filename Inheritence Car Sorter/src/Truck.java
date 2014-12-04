
public class Truck extends SUV
	{
	
	
	public Truck()
		{
		myTurboCharged = (TurboCharged) new notTurboCharged();
		String engine = "ford 302 5.0 V8";
		name = "Truck";
		}
	public void interiorDesign()
	{
		System.out.println("This truck has a cloth interoir and plastic mats made for it to get dirty.");
		
	}
	
	public void specs()
	{
		System.out.println(name);
		System.out.println("This Truck has a " + engine + "engine.");
		System.out.println("It also is 4 wheel drive.");
		
	}
	
	public void canTow()
	{
		super.canTow();
		System.out.println("This is truck particulary a very heavy duty truck and can tow almost anything.");
	}
	
	//public void bedDemensions()
	//{
	//	System.out.println("The bed deminsions on this truck are 6 feet by 4 feet.");
	//}

	}
