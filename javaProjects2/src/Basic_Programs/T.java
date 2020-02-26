package Basic_Programs;
class T
{
public void m1(String s)
{
System.out.println("string version");
}

public static void main(String[] args)
{
T t=new T();
t.m1("durga");//string version

t.m1(null);
}
}