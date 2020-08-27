import java.util.*;
import java.util.Map.Entry;
/**
 *
 * @author jahnvi
 */
public class MapExp {
    public static void main(String args[])
    {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
       Set<Entry<Integer,String>> entryset=map.entrySet();
       for(Entry<Integer,String> entry:entryset)
       {
           System.out.println(entry.getKey()+":"+entry.getValue());
       }
       System.out.println("-------------");
       HashMap<Integer,String> anotherMap=new HashMap<Integer,String>();
       anotherMap.putAll(map);
       entryset=anotherMap.entrySet();
       for(Entry<Integer,String> entry:entryset)
       {
           System.out.println(entry.getKey()+":"+entry.getValue());
       }
    }
}
