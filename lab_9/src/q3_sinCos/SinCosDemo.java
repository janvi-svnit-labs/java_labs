package q3_sinCos;
import java.util.Scanner;

class Sin implements Runnable{
	private int start;
	private int end;
	
	public Sin(int start, int end)
	{
		this.start=start;
		this.end=end;		
	}
	
	public void run()
	{
		int i=start;
		while(i<=end)
		{
			System.out.println("Sin("+i+") = "+(float)Math.sin(Math.toRadians(i))+"  Running on: "+Thread.currentThread().getName());
			i++;
		}
	}
}
class Cos implements Runnable{
	private int start;
	private int end;
	
	public Cos(int start, int end)
	{
		this.start=start;
		this.end=end;		
	}
	
	public void run()
	{
		int i=start;
		while(i<=end)
		{
			System.out.println("Cos("+i+") = "+(float)(Math.cos(Math.toRadians(i)))+"  Running on: "+Thread.currentThread().getName());
			i++;
		}
	}
}

public class SinCosDemo {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the starting point for calculation(in degrees): ");
		int start=sc.nextInt();
		System.out.println("Enter the ending point for calculation(in degrees): ");
		int end=sc.nextInt();
		
		Sin sin=new Sin(start, end);
		Cos cos=new Cos(start, end);
		
		Thread t1=new Thread(sin, "Sin-Thread");
		Thread t2=new Thread(cos, "Cos-Thread");
		
		t1.start();
		t2.start();
		
		sc.close();
	}
}
