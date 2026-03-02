package l7q3_Book;

public class Periodical extends BookInfo{
	String period;
	
	public void changePeriod(String newPeriod)
	{
		period=newPeriod;
	}
	public void changePrice(double newPrice)
	{
		price=newPrice;
	}
	public void displayBook()
	{
		System.out.println("Book title: "+title);
		System.out.println("Book author: "+author);
		System.out.println("Book book id: "+bookID);
		System.out.println("Book price: "+price);
	}
	public void displaypd()
	{
		System.out.println("periodical title: "+title);
		System.out.println("periodical author: "+author);
		System.out.println("periodical book id: "+bookID);
		System.out.println("periodical price: "+price);
		System.out.println("periodical period: "+period);
	}
}
