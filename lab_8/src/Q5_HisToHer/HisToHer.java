package Q5_HisToHer;
import java.io.*;

public class HisToHer {
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
			
			String up=str.toUpperCase();
			
			StringBuffer res=new StringBuffer("");
			
			int indexHis=up.indexOf("HIS");
			int k=0;
			while(k<up.length())
			{
				if(k==indexHis)
				{
					res.append("her");
					k=indexHis+3;
					indexHis=up.indexOf("HIS", indexHis+1);
				}
				else
				{
					res.append(str.charAt(k));
					k++;
				}
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
