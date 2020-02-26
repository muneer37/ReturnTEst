package interview_Programs;

public class PrimeNumbers {

	public static void main(String[] args) {
		

			  int num = 20, count;
			  for (int i = 1; i <= num; i++)
			  {
				  count = 0;
				  for (int j = 2; j <= i / 2; j++) 
				  {
				  if (i % j == 0) 
				  {
					  System.out.println("i="+i);
					  System.out.println("j="+j);
				   count++;
				   //System.out.println("count++="+count++);
				   break;
				  }
				  System.out.println("final count++="+count++);
				 }
				  if (count == 0) 
				  {
					  System.out.println(" last count ="+count);
					    System.out.println(i);
				  }
			  }		  
				  
	}
}	
