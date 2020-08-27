import java.util.*;
/**
 *
 * @author jahnvi
 */
public class LinkedHashSetExp {
     public static void main(String args[])
    {
        Set <String> a=new LinkedHashSet<String> ();
        a.add("Amit");
        a.add("vijay");
        a.add("Sam");
        a.add("Sam");
        a.add("Harry");
        for(String str:a)
        {
            System.out.println(str);
        }
    } 
}
