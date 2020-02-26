package Array;
class Constr_Chaningproblem
{
	 Constr_Chaningproblem()
	{
		// this();
		System.out.println("ZERO");
	}
	Constr_Chaningproblem(int a)
	{
		System.out.println("a1="+a);
	}
	Constr_Chaningproblem(double b)
	{
		this(45);
		System.out.println("b1="+b);
	}
	Constr_Chaningproblem(int a,double b)
	{
		this(6.9);
		System.out.println("a2="+a);
			System.out.println("b2="+b);
	}
	Constr_Chaningproblem(double b,int a)
	{
		
		System.out.println("a3="+a);
			System.out.println("b3="+b);
	}


	public static void main(String[] args) 
	{
		
		Constr_Chaningproblem con=new  Constr_Chaningproblem();
		Constr_Chaningproblem con1=new  Constr_Chaningproblem(25);
		Constr_Chaningproblem con2=new  Constr_Chaningproblem(4.9);
		Constr_Chaningproblem con3=new  Constr_Chaningproblem(25,4.9);
		Constr_Chaningproblem con4=new  Constr_Chaningproblem(4.9,25);
	}
}
