package starpattern;
import java.util.*;

public class Collection2{     // prority queve 
public static void main(String args[]){  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("E");  
queue.add("C");  
queue.add("D");  
queue.add("A");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek()); // first person name based on ailpha
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println("itr="+itr.next());  
}  
queue.remove(); 

queue.poll();  
 
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println("it2="+itr2.next());  
}  
}  
}  
