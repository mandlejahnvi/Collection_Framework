import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayExp4 {
     public static void main(String args[])
    {
       
        List <Integer> a=new ArrayList<Integer> ();
        a.add(100);
        a.add(20);
        a.add(5);
        int []ar={0,0,0};
        int i=0;
        System.out.println(a.size());
        Iterator itr= a.iterator();
        while(itr.hasNext())
        {
            ar[i]=(int)itr.next();
            i++;
            //System.out.println(itr.next());
        }
        for(int a1=0;a1<3;a1++)
              {
                  for(int j=a1+1;j<3;j++)
                  {
                      if(ar[a1]>ar[j])
                      {
                          int temp;
                          temp=ar[a1];
                          ar[a1]=ar[j];
                          ar[j]=temp;
                      }
                  }
              }
        for(int l=0;l<3;l++)
        {
            System.out.println(ar[l]);
        }
    }
}
