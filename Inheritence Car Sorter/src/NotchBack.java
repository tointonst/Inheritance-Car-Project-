public class NotchBack extends Sedan
	{
	double zeroToSixty = 15;

	public NotchBack()
		{
		myTurboCharged = (TurboCharged) new notTurboCharged();
		}

	public void interiorDesign()
		{
		System.out
				.println("This is a modist cloth interior with no extras such as heat seaters");
		}

	public void specs()
		{
		System.out.println("Subaru legacy notchback");
		System.out
				.println("This is a normal sedan and its nessisarly fast and goes from 0 to 60 in  "
						+ zeroToSixty);

		}

	public void descriptionOfBody()
		{
		System.out
				.println("This Body style is sleek and chizled for one of the nice looking sedans for the money.");

		}

	}
