package l7q2_VehicleClass;

public class Car extends Vehicle{
	double max_speed=180;
	Car()
	{
		super();
	}
	public void maxSpeed()
	{
		System.out.println("Max speed of car is 180 km/hr");
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
