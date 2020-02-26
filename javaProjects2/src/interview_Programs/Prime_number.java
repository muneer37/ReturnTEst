package interview_Programs;

public class Prime_number
{    
	public static boolean isPreme(int b)
	{
		int t=0;
		 for(int i=2;i<=b;i++)   // i=0 then exception occur 
			                      // i==1 then every number divible by 1
	       {      
	    	   if(b%i==0)
	    	   {      
	    		    t=t+1; 
	    		   
	    		 }      
	    	  }    
		return t==1;
	}

	 public static void main(String args[])
	 {    
	      boolean a= isPreme(93); 
	  if(a)
	  {  
	   System.out.println(" is prime number");      
	  }
	     else{  
	        
	      System.out.println(" is not prime number"); 
	    		     
	       }
	}    
	}   