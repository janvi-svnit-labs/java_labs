package l7q1_AnnualInterest;

public class AnnualInterest {
	double pAmount;
	double interest;
	int months;
	public double calcTotalInterest(double pAmount, double interest, int months)
	{
		return (pAmount*interest*months/(1200));
	}
}
