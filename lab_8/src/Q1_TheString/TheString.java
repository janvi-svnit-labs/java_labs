package Q1_TheString;

import java.io.*;

public class TheString {
	public static void main(String args[])
	{
		File f1=new File("E:\\java_progs\\sdj.txt");
		try 
		{
			FileReader fr=new FileReader(f1);
			String str="";
			int i=0;
			
			while((i=fr.read())!=-1)
			{
				str=str+(char)i;
			}
			fr.close();
			String up=str.toUpperCase();
			int The1st=up.indexOf("THE");
			if(The1st!=-1)
			{
				int TheLast=up.lastIndexOf("THE");
				if(The1st==TheLast)
				{
					System.out.println("only 1 the is present in the file. ");
					return;					
				}
				else
				{
					String res=str.substring(The1st+3, TheLast);
					System.out.println(res);
				}
			}
			else
			{
				System.out.println("No the exist in the file");
				return;
			}
			
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	
}
//import java.io.*;
//
//public class TheString 
//{
//	public static void main(String[] args) 
//	{
//		File f = new File("C:\\Users\\JANVI\\OneDrive\\Desktop\\sdj.txt");
//
//		try
//		{
//			FileReader fr = new FileReader(f);
//
//			int ch;
//			String data = "";
//
//			while((ch = fr.read()) != -1) //Storing complete data into a string
//			{
//				data += (char) ch;
//			}
//
//			fr.close();
//
//			String subdata = data.toLowerCase(); //For easy comparison making a complete lower case string 
//
//			int firstOccur = subdata.indexOf("the");
//
//			if(firstOccur == -1)
//			{
//				System.out.print("The file doesn't contain string \"the\"");
//				return;
//			}
//
//			int lastOccur = subdata.lastIndexOf("the");
//
//			if(lastOccur == firstOccur)
//			{
//				System.out.print("The file only contains one \"the\"");
//				return;
//			}
//			
//			String str = data.substring(firstOccur+3,lastOccur);	//Making a subString storing all the data in between first ad last "the"
//			System.out.print(str);
//			
//			fr.close();
//		}
//		catch(IOException ex)
//		{
//			
//	}
//	}
//}