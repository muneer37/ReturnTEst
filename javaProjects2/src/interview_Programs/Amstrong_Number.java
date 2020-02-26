package interview_Programs;

public class Amstrong_Number {

	public static void main(String[] args) {
		
		int n=153;
		int temp=n;
		int c=0,a;
		while(n>0)
		{
			System.out.println("n="+n);
			a=n%10;
			System.out.println("n2="+n);
			System.out.println("a="+a);
			n=n/10;
			System.out.println("n3="+n);
			c=c+(a*a*a);
			System.out.println("c="+c);
			System.out.println("a2="+a);
		}
		if(temp==c)
	  	  {  
	  	   System.out.println(" is Amstrong  number");      
	  	  }
	  	   
		       else{  
	  	        
	  	      System.out.println(" is not Amstrong number"); 
	  	    		     
	  	       }
	  	}    
	        

	}

	


