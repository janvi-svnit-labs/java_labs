package Q4_FirstLetterCapital;
import java.io.*;

public class FirstLetterCapital {
	public static void main(String args[])
	{
		File f=new File("E:\\java_progs\\sdj.txt");
		try
		{
			FileReader fr=new FileReader(f);
			int i;
			String str="";
			
			while((i=fr.read())!=-1)
			{
				str=str+(char)i;
			}
			
			StringBuffer res=new StringBuffer("");
			
			int k=0; 
			while(k<str.length())
			{
				if(str.charAt(k)==' ' || str.charAt(k)=='\n')
				{
					res.append(str.charAt(k));
					res.append(str.substring(k+1, k+2).toUpperCase());
					k++;
				}
				else
				{
					res.append(str.charAt(k));
				}
				k++;
			}
			
			System.out.println(res);
			
			FileWriter fw=new FileWriter(f);
			fw.write(res.toString());
			
			fr.close();
			fw.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
