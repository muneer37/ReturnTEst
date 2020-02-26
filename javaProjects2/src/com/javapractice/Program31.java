package com.javapractice;

public class Program31   // count no of words in string 
{  
    public static void main(String[] args) {  
        //String sentence = "Beauty lies in the eyes of beholder"; 
        String sentence ="i love my india";
        int wordCount = 0;  
          
        for(int i = 0; i < sentence.length()-1; i++) {  
            //Counts all the spaces present in the string  
            //It doesn't include the first space as it won't be considered as a word  
            if(sentence.charAt(i) == ' ') {  
                wordCount++;  
                System.out.println(i);
            }  
        }  
          
        wordCount++;  
        
        System.out.println("Total number of words in the given string: " + wordCount);  
    }  
} 

