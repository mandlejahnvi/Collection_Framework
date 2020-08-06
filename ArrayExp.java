import java.util.*;

public class ArrayExp {
	public static void main(String args[])
    {
        ArrayList <String> a=new ArrayList<String> ();
        a.add("Tina");
        a.add("Neha");
        a.add("Roy");
        int aw=a.size();
        System.out.println(aw);
        Iterator itr= a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

