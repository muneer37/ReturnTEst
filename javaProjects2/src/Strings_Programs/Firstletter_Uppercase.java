package Strings_Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
   
//https://focusinfotech.com/job-opening/AutomationTesting-jobs-in-Bhubaneswar-Hyderabad-3-year-experience-65851/  


public class Firstletter_Uppercase {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter a line ");
		String input=br.readLine();
		
		StringBuilder sb = new StringBuilder(input.length());
		
		String[] s2 =input.split(" ");
		
		for(int i=0;i<=s2.length;i++)
		{
			sb.append(Character.toUpperCase(s2[i].charAt(0) )).append(s2[i].substring(1)).append(" ");
		}
        
		System.out.println(sb);
	}

}
