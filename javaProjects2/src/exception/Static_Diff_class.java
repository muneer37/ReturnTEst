package exception;


class Statc_Other_class
{
	static int a;
	static
	{
	a=4545;
	System.out.println("static block excecuting ");
	}

	}


public class Static_Diff_class {                  // static block same class 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started  ");

		System.out.println("a= "+Statc_Other_class.a); // static member otherclass - classname.membername
		System.out.println("main method ended ");

	}
	

}
