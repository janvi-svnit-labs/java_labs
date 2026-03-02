package l7q2_VehicleClass;


public class Scooter extends Vehicle{
	double max_speed=100;
	Scooter()
	{
		super();
	}
	public void maxSpeed()
	{
		System.out.println("Max speed of Scooter is 100 km/hr");
		if(speed>max_speed)
		{
			try
			{
				throw new SpeedException("SpeedLimitExceed");
			}
			catch(SpeedException ex)
			{
				ex.printStackTrace();
			}
		}
		else
		{
			System.out.println("Speed is within limit");
		}
	}
}
