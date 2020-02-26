package file_programs;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DatafromFile {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		
		FileReader fw= null;
		try
		{
		
			fw=new FileReader("E:\\basha\\Hyderabad.txt");
			int a=fw.read();    // word size in path
			System.out.println("data="+fw.read());
			while(a!=-1)
			{
				System.out.println((char)a);
				//System.out.println((int)a);
				a=fw.read();
			}
		}
		 catch(FileNotFoundException e)
		{
			 e.printStackTrace();
		}
		 catch(IOException e)
		{
			 e.printStackTrace();
		}
		
		 finally
		 {
			 try{
				 fw.close();
			 }
			 catch(IOException e)
			 {
				 e.printStackTrace();
			 }
		 }

	}

}
