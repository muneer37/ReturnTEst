package com.javapractice;

class Sample
{
	
	public String toString()
	  {
		return"i well oveerride";
 
	   }
	
	public int hashCode()
	  {
		return 13;
 
	   }
}
public class Overriden_downcastind  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ref=new Sample();
		String ref2=ref.toString();
		int ref3=ref.hashCode();
		
		System.out.println("result="+ref);
		System.out.println("result2="+ref2);
		System.out.println("result3="+ref3);
		

	}

}