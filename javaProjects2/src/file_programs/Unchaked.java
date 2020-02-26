package file_programs;
import java.sql.SQLException;

class Base
{
	public  void connectTob(String username,String password)throws SQLException 
	{
		if(username =="munna786" && password =="munna")
		{
			System.out.println("continue home page");
		}
		else
		{
			//throw new SQLException();
		}
		
	}
}
class Unchaked
{
	public static void main(String [] args)
	{
		Base ref= new Base();
		try
		{
			ref.connectTob("munna786","munna");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
	}
}
