import java.util.*;
/**
 *
 * @author jahnvi
 */
public class HashSetExp {
     public static void main(String args[])
    {
        Set <String> a=new HashSet<String> ();
        a.add("Amit");
        a.add("vijay");
        a.add("Jay");
        a.add("Amit");
        a.add("Harry");
        for(String str:a)
        {
            System.out.println(str);
        }
    } 
}
