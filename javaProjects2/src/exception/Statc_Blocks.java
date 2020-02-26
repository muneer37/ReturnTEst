package exception;

public class Statc_Blocks {                  // static block same class 
	
	static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started  ");

		System.out.println("a= "+a);
		System.out.println("main method ended ");

	}
	static
	{
	a=4545;
	System.out.println("static block excecuting ");
	}

}
