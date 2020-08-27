import java.util.*;
/**
 *
 * @author jahnvi
 */
public class LinkedExp {
    public static void main(String args[])
    {
        List <String> a=new LinkedList<String> ();
        a.add("node1");
        a.add("node2");
        a.add("node3");
        Iterator itr= a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
