package starpattern;

public class Program10 {       // LCM of two numbers 

	public static void main(String[] args) {
		

int a=50;
int b=90;
int max=a;
if(a>b)
{ max=b;
	}
int temp=max;
while(true)
{
if(max%a==0 && max%b==0)
{
	System.out.println(max);
	break;
}
max=max+temp;
	}
	}

}
