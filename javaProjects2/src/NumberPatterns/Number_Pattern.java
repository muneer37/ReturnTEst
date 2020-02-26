package NumberPatterns;

public class Number_Pattern {

	public static void main(String[] args) {

		int rows =4;
		
		for (int spaces=1; spaces <= rows; spaces++)
		{
		
		  for (int number=1;  number <= spaces; number++)
		   {
		     System.out.print(number +" ");
		    }
		  for (int k=spaces-1;k>=1; k--)
		  {
			     System.out.print(k +" ");
		   }
		
		System.out.println();}
	}

}
