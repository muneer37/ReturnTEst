package exception;

public class String_Builder_methos {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java";
		
		StringBuilder sb = new StringBuilder(str);   // reverse()
		sb.reverse();
		System.out.println(sb);
		
		sb.append("testing "); //adding                   // append("")
		System.out.println("sb2 ="+sb);
		
		
		String sk="RAJa";
		sk=sk.toLowerCase();                            //toLowerCase()
		System.out.println("sK ="+sk);  
		
		
	
		
		

	}

}