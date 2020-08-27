import java.util.*;
/**
 *
 * @author jahnvi
 */
public class Emp {
    public static void main(String args[])
    {
        List <String> staff=new LinkedList<String>();
        staff.add("Amit");
        staff.add("bob");
        staff.add("carl");
        Iterator itr=staff.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        itr.remove();
        Iterator itr1=staff.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }
}
