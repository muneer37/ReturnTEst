package interview_Programs;

public class No_Of_Words_In_String
{  
    public static void main(String[] args) {  
        //String sentence = "Beauty lies in the eyes of beholder"; 
        String sentence ="i love my india";
        int wordCount = 0;  
          
        for(int i = 0; i < sentence.length()-1; i++) {  
           
            if(sentence.charAt(i) == ' ') {  
                wordCount++;  
                System.out.println("i="+i);
            }  
        }  
          
        wordCount++;  
        
        System.out.println("Total number of words in the given string: " + wordCount);  
    }  
} 
