package old2;

class Flightticket 
{
	public void journey()
	{
		System.out.println("start the jouney");
	}
}
class Passport
{
	public void check()
	{
		System.out.println("checking is done");
	}
	public void bag()
	{
		System.out.println("bag checking  is done");
	}
}
class JourneyDubai
{
	public void flight(Flightticket FT,Passport PP)
	{
		PP.check();
		FT.journey();
	    PP.bag();
		FT.journey();
	}
	   
}


class MainClass333 
   {

	public static void main(String[] args) 
	{
		JourneyDubai jd=new JourneyDubai();
		jd.flight(new Flightticket(),new Passport());

		System.out.println("In Dubai");
	   }
   }
	
