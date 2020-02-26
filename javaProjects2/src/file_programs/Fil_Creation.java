package file_programs;
import java.io.File;
import java.io.IOException;


public class Fil_Creation
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println("main method started ");
		
		String path="E:\\basha\\mkspider.pdf";
		File ref= new File(path);
		try   
		{  
		//boolean ref2 = ref.createNewFile(); 
		System.out.println("file="+ref.createNewFile());
		//System.out.println("new file="+ref2);

		//creates a new file  
		if(ref.createNewFile())      // test if successfully created a new file  
		{  
		System.out.println("file created "+ref.getCanonicalPath()); //returns the path string  
		}  
		else  
		{  
		System.out.println("File already exist at location: "+ref.getCanonicalPath());  
		}  
		}
		  catch(IOException e)
		    {
			e.printStackTrace();
		    }
		System.out.println("main method ended ");

	}

}
