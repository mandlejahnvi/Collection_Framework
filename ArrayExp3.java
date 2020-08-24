import java.util.*;
public class ArrayExp3 {
    public static void main(String args[])
    {
        List <Integer> a=new LinkedList<Integer> ();
        a.add(10);
        a.add(20);
        a.add(30);
       List <Integer> b=new LinkedList<Integer> ();
        b.add(10);
        b.add(20);
        b.add(30);
        b.addAll(1,a);
        System.out.println("Size of Array :"+a.size());
    }    
}
