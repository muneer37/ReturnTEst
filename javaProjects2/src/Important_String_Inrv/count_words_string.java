package Important_String_Inrv;

public class count_words_string {

	
	public static void main(String[] args) {
		
		String str="I Love India 123 @#$";
		
		int dig_cnt=0,up_cnt=0,lower_count=0,space_count=0,special_character=0;
		
		for(int i=0;i<str.length();i++)  {
			// System.out.println("char="+str.charAt(i));
		  if(Character.isDigit(str.charAt(i)))
			{
				dig_cnt++;
				
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{ 
				up_cnt++;
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				lower_count++;
			}
			else if(Character.isSpaceChar(str.charAt(i)))
			{
				space_count++;
			}
			else {
			
				special_character++;
			}
			 
		}
	
		System.out.println("Numbers in word="    +dig_cnt);
		System.out.println("captital letters="   +up_cnt);
		System.out.println("lower letters="      +lower_count);
		System.out.println("spaces between words ="      +space_count);
		System.out.println("special chracter ="+special_character);
	}

}
