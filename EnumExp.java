import java.util.*;
enum weekday{Monday,Tuesday,wednesday,thusday,friday,saturday,sunday};
/**
 *
 * @author jahnvi
 */
public class EnumExp {
  public static void main(String args[])
    {
        
        weekday[] w = weekday.values();
 
        for (weekday d : w) {
               System.out.println(d);
}
    }    
}
