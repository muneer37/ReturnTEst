class Drawing 
{
	void house()
	{
		System.out.println("not bad");
	}
}
class Drawing2 extends Drawing 
{
	void house()
	{
		System.out.println(" super ");
	}
}
class Drawing3 extends Drawing 
{
	void house()
	{
		System.out.println(" super ");
	}
}
class designer
{
	public void houselook(Drawing ref)
		ref.house();
}
}
class MainClass567
{

	public static void main(String[] args) 
	{
		Designer mk= new Designer(); 
		mk.houselook(new Drawing());
	}
}
