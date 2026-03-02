package l7q1_AnnualInterest;
import java.util.Scanner;
import UserDefinedException.NoNegative;

public class InterestDemo{
	public static void main()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter principle amount: ");
		double pAmount=sc.nextDouble();
		if(pAmount<0)
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
		System.out.println("Enter interest rate: ");
		double interest=sc.nextDouble();
		if(interest<0)
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
		System.out.println("Enter number of months: ");
		int months = sc.nextInt();
		if(months<0)
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
		
		AnnualInterest ai=new AnnualInterest();
		
		double totalInterest=ai.calcTotalInterest(pAmount, interest, months);
		
		System.out.println("Total interest after "+months+" is "+totalInterest);
		
		sc.close();
	}
}