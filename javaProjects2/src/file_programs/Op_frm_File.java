package file_programs;
import java.io.*;

public class Op_frm_File {

	public static void main(String[] args) {           // my program
		// TODO Auto-generated method stub
		
		FileDescriptor fd = null;  
	        byte[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58 };  
	        try  {  
	            FileOutputStream fos = new FileOutputStream("E:\\basha\\mspider.txt");  
	            FileInputStream fis = new FileInputStream("mspider.txt");  
	            fd = fos.getFD();  
	            fos.write(b);  
	            fos.flush();  
	            fd.sync();// confirms data to be written to the disk  
	            int value = 0;  
	            
	            while ((value = fis.read()) != -1) {  
	                char c = (char) value;    // converts bytes to char  
	                System.out.print((char)c);  
	            }  
	            System.out.println("\nSync() successfully executed!!");  
	        } 
	        catch (Exception e)
	           {  
	            e.printStackTrace();  
	           }  

	}

}
