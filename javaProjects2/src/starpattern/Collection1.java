package starpattern;
import java.util.*; 

class Collection1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("a");//Adding object in arraylist  
list.add("c");  
list.add("b");  
list.add("d");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  