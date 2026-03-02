package l7q2_VehicleClass;
import java.util.Scanner;
import UserDefinedException.NoNegative;
public class VehicleDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the vehicle u r driving: ");
		String vehi=sc.nextLine();
		
		if(vehi.equalsIgnoreCase("car"))
		{
			Car car=new Car();
			System.out.println("Enter speed: ");
			car.speed=sc.nextDouble();
			if(car.speed<0)
			{
				try
				{
					throw new NoNegative("NegativeInput");
				}
				catch(NoNegative ex)
				{
					ex.printStackTrace();
					System.exit(0);
				}
			}
			
			car.maxSpeed();
		}
		else if(vehi.equalsIgnoreCase("Scooter"))
		{
			Scooter scooter=new Scooter();
			System.out.println("Enter speed: ");
			scooter.speed=sc.nextDouble();
			if(scooter.speed<0)
			{
				try
				{
					throw new NoNegative("NegativeInput");
				}
				catch(NoNegative ex)
				{
					ex.printStackTrace();
					System.exit(0);
				}
			}
			
			scooter.maxSpeed();
		}
		else if(vehi.equalsIgnoreCase("Bicycle") || vehi.equalsIgnoreCase("cycle"))
		{
			Bicycle bc=new Bicycle();
			System.out.println("Enter speed: ");
			bc.speed=sc.nextDouble();
			if(bc.speed<0)
			{
				try
				{
					throw new NoNegative("NegativeInput");
				}
				catch(NoNegative ex)
				{
					ex.printStackTrace();
					System.exit(0);
				}
			}
			
			bc.maxSpeed();
		}
		sc.close();
	}
}
