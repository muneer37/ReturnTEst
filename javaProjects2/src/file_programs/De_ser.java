package file_programs;
import java.io. * ;

  
class De_ser{  
 public static void main(String args[]){ 
	 
  try{  
  
	  FileInputStream fin = new FileInputStream("E:\\basha\\Hyderabad.txt");
  ObjectInputStream in=new ObjectInputStream(fin);  
  Actor s=(Actor)in.readObject();  
  //printing the data of the serialized object  
  System.out.println(s.name+" "+s.age+" "+s.salary+" ");  
  //closing the stream  
  in.close();  
  }catch(Exception e)
    {
	  System.out.println(e);
	  }  
 }  
}


/*try{
FileInputStream fis=new FileInputStream("E:\\basha\\Hyderabad.txt");
ObjectInputStream ob= new ObjectInputStream(fis);
Actor s= (Actor)ob.readObject();
//System.out.println(ob.name+""+ob.age+""+ob.salary+"");
System.out.println(s.name);
System.out.println(s.age);
System.out.println(s.salary);
}
catch(Exception e)
{
e.printStackTrace();

}*/