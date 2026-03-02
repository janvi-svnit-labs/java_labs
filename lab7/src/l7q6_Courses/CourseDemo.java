package l7q6_Courses;
import java.util.Scanner;
import UserDefinedException.NoNegative;

public class CourseDemo {
	public static void main(String argr[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of courses: ");
		int n=sc.nextInt();
		sc.nextLine();
		
		Courses[] cr=new Courses[n];
		
		for(int i=0; i<n; i++)
		{
			cr[i]=new Courses();
			
			System.out.println("Course "+i+": ");
			
			System.out.println("Enter members id: ");
			cr[i].memID=sc.nextLine();
			System.out.println("Enter course description: ");
			cr[i].descrip=sc.nextLine();
			System.out.println("Enter course duration: ");
			cr[i].duration=sc.nextLine();
			System.out.println("Enter course fees: ");
			cr[i].fees=sc.nextDouble();
			sc.nextLine();
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Course "+i+": ");
			cr[i].displayData();
		}
	}
}
