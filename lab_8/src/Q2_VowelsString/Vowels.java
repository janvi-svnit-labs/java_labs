package Q2_VowelsString;
import java.io.*;

public class Vowels {
	public static void main(String args[])
	{
		File f=new File("E:\\java_progs\\sdj.txt");
		try
		{
			FileReader fr=new FileReader(f);
			int ch, pos=0;
			while((ch=fr.read())!=-1)
			{
				if((char)ch=='a' || (char)ch=='A' || (char)ch=='e' || (char)ch=='E' || (char)ch=='i' 
				|| (char)ch=='I' || (char)ch=='o' || (char)ch=='O' || (char)ch=='u' || (char)ch=='U')
				{
					System.out.println((char)ch+" at position: "+pos);
				}
				pos+=1;
			}
			fr.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
}
