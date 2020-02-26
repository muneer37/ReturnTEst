  package interview_Programs;

public class Perfect_Number 
    {
	  public static boolean isPerfect(int a)
	  {
		  int count=0;
		  for(int i=1;i<=a/2;i++)
		  {
			   if (a % i == 0) 
 			  {        
		              count=count+i;
		              System.out.println("a ="+a);
		              System.out.println("i ="+i);
		              System.out.println(count);
			  }
		  }
		  return a==count;
	  }
   public static void main(String[] args)
   {
	        boolean res = isPerfect(16);
	        System.out.println(res);
	        if(res)
	  	  {  
	  	   System.out.println(" is Perfect  number");      
	  	  }
	  	     else{  
	  	        
	  	      System.out.println(" is not Perfect number"); 
	  	    		     
	  	       }
	  	}    
	        
	}


