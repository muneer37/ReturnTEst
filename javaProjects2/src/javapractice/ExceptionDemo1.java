package javapractice;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				
		try
		{
			System.out.println("Enter How many days require for work : ");
			int days=sc.nextInt();
			System.out.println("Enter Completed Days of work.... : ");
	
	        int workDays=sc.nextInt();
			for(int i=1;i<=workDays;i++)
			{
				System.out.println("Enter\t"+i+ "\tRepor");
			
			String report = sc.next();
			}
			if(days==workDays)
			{
				System.out.println("Work Completed");
				
			}
			else
			{
				if(days/0==0)
				{
					
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Work Completed Before target days");
			System.out.println("Exception is : "+e);
		}
		
	}

}
