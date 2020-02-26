package file_programs;
import java.io.*;

public class D2F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		FileWriter fw=null;
		try {
			fw= new FileWriter("d:/munna/filehandling/mk.pdf");
			fw.write("Hii How r u");
			System.out.println("data writen ");
		    }
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.flush();
			    fw.close();	
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
				
	}

}
