
public class SportsCar extends Sedan
	{
   double zeroToSixty = 4.5;
   
   public SportsCar()
		{
		myTurboCharged = (TurboCharged) new isTurboCharged();
		}
	
	public void interiorDesign()
	{
		System.out.println("This is a very luxurious intior with lots of extras costing a lot.");
	}
	
	public void specs()
	{
		System.out.println("Sports Car");
		System.out.println("This sports car is very fast and can go from 0 to 60 in " + zeroToSixty);
	}
	
	public void descriptionOfBody()
	{
		System.out.println("This Body style is sleek and fast just for a sportscar.");
		
	}
	

	}
