package Q3_NameFile;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class NameFile{
	public static void main(String args[])
	{
		ArrayList<String> name = new ArrayList<>();
		try
		{
			FileReader fr=new FileReader(new File("E:\\java_progs\\name.txt"));
			int i; 
			String str="";
			while((i=fr.read())!=-1)
			{
				if((char)i==' ')
				{
					if(str.length()>3) 
						name.add(str.substring(3));
					else
						name.add(" ");
					str = "";
				}
				else
					str=str+(char)i;
			}
			
			System.out.println(name);
			
			Collections.sort(name);
			
			System.out.println(name);
			
			fr.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
