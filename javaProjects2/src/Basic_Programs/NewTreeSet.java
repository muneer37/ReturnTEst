package Basic_Programs;
import java.util.TreeMap;
public class NewTreeSet extends java.util.TreeSet
{
    public static void main(String [] args) 
    {
        java.util.TreeSet t = new java.util.TreeSet();
        t.clear();
    }
    public void clear() 
    {
        TreeMap m = new TreeMap();
        m.clear();
    }
}