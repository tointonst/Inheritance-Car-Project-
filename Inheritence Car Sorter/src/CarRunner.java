
public class CarRunner
	{

	public static void main(String[] args)
		{
		SUV [] suv = new SUV [2];
		
		suv [0] = new Truck();
	
		suv [1] = new Jeep();
		
		for(int i = 0; i < suv.length; i++)
		{
		suv[i].specs();
		suv[i].interiorDesign();
		suv[i].canTow();
		
			System.out.println("");
			
		}
		
		Sedan [] sedan = new Sedan [2];
		
		sedan[0] = new SportsCar();
		sedan [1] = new NotchBack();
		
		for(int i = 0; i < sedan.length; i++)
		{
			sedan[i].specs();
			sedan[i].interiorDesign();
			sedan[i].descriptionOfBody();
			System.out.println("");
		}
		}

	}
