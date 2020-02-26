package Interview_Programs;

public class Number_Patterns1 {

	public static void main(String[] args) {

		int rows =4;

		for (int spaces=1; spaces <= rows; spaces++)
		{
		
		for (int number=1;  number <= spaces; number++)
		   {
		     System.out.print(number +" ");
			}
		
		System.out.println();
		}
	}

}
