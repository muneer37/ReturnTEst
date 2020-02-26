package Interview_Programs;

public class Number_pattern3
{
    public static void main(String[] args)
    {
        

        int rows = 4;
        
        System.out.println("** Printing the pattern... **");
        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k >= rows - i + 1; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
