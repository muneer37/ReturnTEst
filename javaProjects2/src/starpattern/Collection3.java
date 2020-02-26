package starpattern;
import java.util.*;  
import java.lang.String;
	

class Book implements Comparable {  
int id;  
String name;
String author; 
String publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}
public int compareTo(Object ob) {
	
	Book bt = (Book)ob;
	return (int)(this.id-bt.id);
}  
}  
public class Collection3 {  
public static void main(String[] args) {  
    HashSet<Book> set=new HashSet<Book>();  
    //Creating Books  
    Book b1=new Book(101,"c","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"a","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"b","Galvin","Wiley",6);  
    //Adding Books to HashSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing HashSet  
    for(Book b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
} 