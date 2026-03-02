package l7q3_Book;
import java.util.Scanner;
import UserDefinedException.*;

public class BookDemo {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		Periodical pd=new Periodical();
		
		System.out.println("Enter Book ID: ");
		pd.bookID=sc.nextInt();
		sc.nextLine();
		if(pd.bookID<0)
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
		System.out.println("Enter book name: ");
		pd.title=sc.nextLine();
		System.out.println("Enter book author: ");
		pd.author=sc.nextLine();
		System.out.println("Enter price: ");
		pd.price=sc.nextDouble();
		sc.nextLine();
		if(pd.price<0)
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
		System.out.println("Is it a periodical(yes or no): ");
		String choice=sc.nextLine();
		
		if(choice.equals("yes"))
		{
			System.out.println("Enter period of periodical: ");
			pd.period=sc.nextLine();
			
			pd.displaypd();
			
			System.out.println("Enter new price: ");
			double new_price=sc.nextDouble();
			sc.nextLine();
			if(new_price<0)
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
			System.out.println("Enter new period: ");
			String new_period=sc.nextLine();
			
			pd.changePeriod(new_period);
			pd.changePrice(new_price);
			
			pd.displaypd();
		}
		else
		{
			pd.displayBook();
			
			System.out.println("Enter new price: ");
			double new_price=sc.nextDouble();
			if(new_price<0)
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
			pd.changePrice(new_price);
			
			pd.displayBook();
		}
		
		sc.close();
	}
}
