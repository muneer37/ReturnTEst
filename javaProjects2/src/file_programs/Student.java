package file_programs;
import java.io.IOException;

class Student1
{
	public void java()throws IOException
	    {
		System.out.println("java");
		throw new IOException();
		}
}
class Student2 extends Student1
{
	public void testing()throws IOException
	    {
		System.out.println("tesing");
		new Student1().java(); 
	
     }
}
class Student3 extends Student2
{
	public void apti()throws IOException
	    {
		System.out.println("apti");
		new Student2().testing();
		
		}
}
public class Student 
{
    public static void main(String[] args) 
    {        // TODO Auto-generated method stub
    	System.out.println("main method started ");
    	
    	try
    	{
                new Student3().apti();    	
    	}
    	
    	catch(IOException e)
    	{
    		
    		System.out.println("exception is handled");
    		e.printStackTrace();
    	}
    	System.out.println("main method ended");
	  
    }

}
