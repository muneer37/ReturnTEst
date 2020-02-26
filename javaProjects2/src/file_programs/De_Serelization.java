package file_programs;
import java.io.*;



public class De_Serelization
{
public static void main(String[] args) {
		
		 
		try{
			FileInputStream fis=new FileInputStream("E:\\basha\\Hyderabad.txt");
		      ObjectInputStream ob= new ObjectInputStream(fis);
		  Actor s= (Actor)ob.readObject();
		      //System.out.println(ob.name+""+ob.age+""+ob.salary+"");
		  System.out.println(s.name);
		  System.out.println(s.age);
		  System.out.println(s.salary);  
		    }
		catch(Exception e)
		   {
		  e.printStackTrace();
		 
		   }
		 
 }

}


