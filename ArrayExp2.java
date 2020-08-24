import java.util.*;

public class ArrayExp2 {
    public static void main(String args[])
    {
        ArrayList <Integer> a=new ArrayList<Integer> ();
        a.add(10);
        Iterator itr= a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("Empty condition: "+a.isEmpty());
        itr.remove();
        System.out.println("Empty condition: "+a.isEmpty());

    }
}
