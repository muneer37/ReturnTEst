package interview_Programs;
public class WordCount_arrays_string
	{  
      static int wordcount(String str)  
        {  
          int count=0;  
         char ch[]= new char[str.length()]; 
          for(int i=0;i<str.length();i++) 
	      {  
             ch[i]= str.charAt(i); 
				
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            return count;  
        }  
          public static void main(String[] args) {  
          String string =" i love my india";  
          System.out.println(wordcount(string) + " words.");   
    }  
}