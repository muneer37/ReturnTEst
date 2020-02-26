class Btech 
{
	public void college()
	{
		System.out.println("B.tech is done");
	}
}
class ReturnTest
{
	public void aptitude()
	{
		System.out.println(" aptitude is done");
	}
	public void tr()
	{
		System.out.println("TR  is done");
	}
}
class Job
{
	public void engineer(Btech bt,ReturnTest iv)
	{
		bt.college();
		iv.aptitude();
		iv.tr();
	}
	   
}


class MainClass999 
   {

	public static void main(String[] args) 
	{
		Job jb=new Job();
		jb.engineer(new Btech(),new ReturnTest());

		System.out.println("finally Doing JOb");
	   }
   }
	
