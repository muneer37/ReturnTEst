package collections;



public class String_Primitive {    //     string is converted  to primitive valve 

	public static void main(String[] args) {
		
		String str = "1234";
		System.out.println("string value="+str);
		int a= Integer.parseInt(str);
		System.out.println("int value="+a);
		String str2 = "22.34";
		System.out.println("string 2 ="+str2);
		double d= Double.parseDouble(str2);
		System.out.println("doble value="+d);
		
	}

}
