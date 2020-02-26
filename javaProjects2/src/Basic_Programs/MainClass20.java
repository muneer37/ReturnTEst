package Basic_Programs;
class Robotv1 
{
	String name="chitii";
	int ram=1000;
	static String robotcreator= "bhagavan";
	float version=2.0f;

       public void mk()
	         {
		        System.out.println("ele job");
	           }
        public void raj(int a,double d)
	      {
		
            System.out.println("a="+a);     
	        System.out.println("d="+d);
	      }


        public void task(String s1,int a)
	       {
	     	System.out.println("s1="+s1);
	         System.out.println("a2="+a);
	      }
}
       public class MainClass20
		{

			 public static void main(String[] args) 
	       {
		
		     Robotv1 ref1=new Robotv1();
		    System.out.println("name ="+ref1.name);     
	        System.out.println("ram="+ref1.ram);
			System.out.println("robotcreator="+new Robotv1().robotcreator);
		    System.out.println("version="+ref1.version);
			ref1.mk();
			ref1.raj(99,8.8);
			ref1.task("qspider",37);

	      }
    }

