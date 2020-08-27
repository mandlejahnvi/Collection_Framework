import java.util.*;
/**
 *
 * @author jahnvi
 */
public class Fill {
     public void pelements()
    {
        List <Integer> list= Arrays.asList(10,20,50,40,30);
        System.out.println("original array elements :"+list);
        Collections.fill(list,8);
        System.out.println("after filling array elements :"+list);
    }
    public static void main(String args[])
    {
        Fill s=new Fill();
        s.pelements();
    }     
}
