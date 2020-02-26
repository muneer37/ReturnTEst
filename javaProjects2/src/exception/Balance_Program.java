package exception;

import java.io.IOException;


class Bank
{
	public void drawmoney(double withdrawmoney) throws IOException
	{
	int balance=1000;
	if( balance >= withdrawmoney )
	{
		System.out.println("take money");
	}
	else
	{
		System.out.println("go and deposite  money");
              
		throw new IOException();
	}
 }
}

public class Balance_Program 
{

	public static void main(String[] args) 
	{
		
   try{
		new Bank().drawmoney(1500);
		
   }
   catch(IOException e )
   {
	  System.out.print("exception handled"); 
   }
   
}

}
