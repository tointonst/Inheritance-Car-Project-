public class NotchBack extends Sedan
	{
	

	public NotchBack()
		{
		myTurboCharged = (TurboCharged) new notTurboCharged();
		double zeroToSixty = 15;
		name = "Subaru legacy notchback";
		}

	public void interiorDesign()
		{
		System.out
				.println("This is a modist cloth interior with no extras such as heat seaters");
		}

	public void specs()
		{
		System.out.println(name);
		System.out
				.println("This is a normal sedan and its nessisarly fast and goes from 0 to 60 in  "
						+ zeroToSixty + " seconds.");

		}

	public void descriptionOfBody()
		{
		System.out
				.println("This Body style is sleek and chizled for one of the nice looking sedans for the money.");

		}

	}
