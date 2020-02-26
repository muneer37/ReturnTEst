package com.javapractice;

public class Repeat_Num_allot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar={10,10,5,5,5,4,4,6,6,100};
		int n=ar.length;
		
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if (ar[i]!=ar[i+1])
			{
				 temp[j++]=ar[i];
			
			//System.out.println(temp[j++]);
			//System.out.print(" ar intial value"+ar[i]);
			}
		}
		
		temp[j++]=ar[n-1];
		//System.out.println("j++ value "+temp[j++]);
		for(int i=0;i<j;i++)
		{
			ar[i]=temp[i];
			System.out.print(ar[i]+" ");
		}
		/*ar=temp;
		//System.out.println("After removing Duplicate ");
		for (int i=0;i<n;i++)
		{
			//System.out.print(ar[i]+" ");
		}*/
		
	}
		

}


