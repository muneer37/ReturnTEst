package file_programs;
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Actor implements Serializable
{
	String name;
	int age;
	double salary;
	public Actor(String name,int age,double salary)
	{
		
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}
public class Serlization_Prog {

	public static void main(String[] args) {
		
		Actor ref=new Actor("surya",45,100000);
		FileOutputStream fout=null;
		try{
		      fout=new FileOutputStream("E:\\basha\\Hyderabad.txt");
		      ObjectOutputStream ob= new ObjectOutputStream(fout);
		      ob.writeObject(ref);
		      System.out.println("Sucessfully Save the  Data");
		    }
		catch(Exception e)
		   {
		  e.printStackTrace();	
		   }
		  finally
		      {
		    	    try{
		    	        fout.close();
		           }
		    	    catch(Exception e)
		    	    {
		    	    	e.printStackTrace();
		    	    }
		     }
 }

}
