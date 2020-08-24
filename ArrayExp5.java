import java.util.*;

public class ArrayExp5 {
    public static void main(String args[])
    {
        List<List<Integer>> arr= new ArrayList<>();
        List<Integer> a1=new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        List<Integer> a2=new ArrayList<>();
        a2.add(40);
        a2.add(50);
        a2.add(60);
        List<Integer> a3=new ArrayList<>();
        a3.add(40);
        a3.add(50);
        a3.add(60);
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        int size=arr.size();
        int [][]ar=new int[size][size];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               ar[i][j]=arr.get(i).get(j);
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               System.out.println(ar[i][j]);
            }
        }
    }
}
