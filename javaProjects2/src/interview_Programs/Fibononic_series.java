package interview_Programs;

public class Fibononic_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c;
		int count=10;
		System.out.println(a +" "+b);
		for (int i=2;i<count;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			//System.out.println("a= "+a);
			//System.out.println("b1= "+b);
			b=c;
			//System.out.println("c="+c);
			//System.out.println("b2="+b);
		}
			

	}

}
