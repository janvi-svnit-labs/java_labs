package l7q7_MCQ;
import java.util.Scanner;
import UserDefinedException.ChoiceException;

enum Result
{
	Correct,
	Wrong,
	Unanswsered;
}

public class McqDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		char[] correct_ans= {'A', 'C', 'C', 'D'};
		char[] submitted_ans= new char[4];
		
		int correct=0, wrong=0, unanswered=0;
		
		System.out.println("Enter (A/B/C/D/X): ");
		for(int i=0; i<4; i++)
		{
			System.out.println("your answer for "+(i+1)+"th ques: ");
			submitted_ans[i]=sc.next().toUpperCase().charAt(0);
			
			if(submitted_ans[i]!='A' && submitted_ans[i]!='B' &&
			submitted_ans[i]!='C' && submitted_ans[i]!='D' && submitted_ans[i]!='X')
			{
				try
				{
					throw new ChoiceException("ChoiceInvalid");
				}
				catch(ChoiceException ex)
				{
					ex.printStackTrace();
				}
			}
		}
		System.out.println("Question\tYour Answer\tCorrect answer\tResult");
		for(int i=0; i<4; i++)
		{
			System.out.print(i+1+"\t\t");
			System.out.print(submitted_ans[i]+"\t\t");
			System.out.print(correct_ans[i]+"\t\t");
			if(submitted_ans[i]=='X')
			{
				System.out.print("Result.Unanswered");
				System.out.println();
				unanswered++;
			}
			else if(submitted_ans[i]==correct_ans[i])
			{
				System.out.print("Result.Correct");
				System.out.println();
				correct++;
			}
			else
			{
				System.out.print("Result.Wrong");
				System.out.println();
				wrong++;
			}
		}
		System.out.println("Correct: "+correct);
		System.out.println("Wrong: "+wrong);
		System.out.println("Unanswered: "+unanswered);
		if(correct>=2)
		{
			System.out.println("Pass!");
		}
		else
		{
			System.out.println("Failed");
		}
		
	}
}
