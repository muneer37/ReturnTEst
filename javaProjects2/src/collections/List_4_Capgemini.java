package collections;
import java.util.ArrayList;

public class List_4_Capgemini {                     // LIKED LIST -1
int noofRounds;
int rating;
int attendance;

public List_4_Capgemini(int noofRounds,int rating,int attedance)
{
	this.noofRounds=noofRounds;
	this.rating=rating;
	this.attendance=attendance;
	}
   public String toString()
   {
	   return" Capgemini(noofRounds="+ noofRounds+",rating="+rating+",attendance="+attendance+")";
   }
}