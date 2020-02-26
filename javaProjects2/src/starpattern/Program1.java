package starpattern;

public class Program1 {

	public static void main(String[] args) {
	    
		for(int r=1;r<=4;r++)
		{
		for(int c=1;c<=4;c++)
		{
			if( ((c==2||c==3)&&(r==3||r==2))   )  
			{
			System.out.print("  ");
			}
			else
			{
				System.out.print("* ");
			}
		} 
			System.out.println();

		
	   }
	}
}
