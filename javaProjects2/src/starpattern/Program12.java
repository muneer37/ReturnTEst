package starpattern;

public class Program12 {

	public static void main(String[] args) {
		
		String s1 = "java";
		s1 ="testy";
		s1="mk";
		
				
		String s2 ="corejava";
		//1.== operator compare the referance variable are matched are not
		//System.out.println("doble equals operator="+s1==s2);
		
		//2 hashcode()
		System.out.println("hashcode s1="+s1.hashCode());
		System.out.println("hashcode s2="+s2.hashCode());
		
		//3 tostring
		System.out.println("tostring method s1 ="+s1.toString());
		System.out.println("tostring method s2 ="+s2.toString());
		
		//4 .eqauls
		System.out.println(" dot euals method="+s1.equals(s2));
		
		System.out.println("intern ="+s1  );
		
	}

}
