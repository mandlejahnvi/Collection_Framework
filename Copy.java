import java.util.*;
/**
 *
 * @author jahnvi
 */
public class Copy {
    public void pelements()
    {
        List <Integer> list= Arrays.asList(10,20,50,40,30);
        List <Integer> list1 =Arrays.asList(1,2,5,4,3);
        System.out.println("original array elements :"+list);
        Collections.copy(list,list1);
        System.out.println("after coping array elements :"+list);
    }
    public static void main(String args[])
    {
        Copy s=new Copy();
        s.pelements();
    }     
}
