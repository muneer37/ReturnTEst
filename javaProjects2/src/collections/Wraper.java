package collections;

public class Wraper {                       // BOXING OPERATION

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=45;
       System.out.println("a="+a);
       Integer ref = new Integer(a);
       System.out.println("integer="+ref);
       double b=7.8;
       Double d1=new Double(b);
       System.out.println("double="+d1);
       Long l1= new Long(123456l);
       System.out.println("long ="+l1);
       Float fe=new Float(5.7f);
       System.out.println("float="+fe);
       
       // primitive value to java object is known as Boxing operations
	}

}


