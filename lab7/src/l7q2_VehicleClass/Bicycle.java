package l7q2_VehicleClass;

public class Bicycle extends Vehicle{
	double max_speed=60;
	Bicycle()
	{
		super();
	}
	public void maxSpeed()
	{
		System.out.println("Max speed of Bicycle is 60 km/hr");
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
