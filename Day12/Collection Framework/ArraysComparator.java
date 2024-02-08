import java.util.*;

class MyComp implements Comparator<Integer>{
     public int compare(Integer a,Integer b){
         if(a<b) return 1;
         if(a>b) return -1;
         return 0;
     }
}
public class ArraysComparator {
    public static void main(String[] args) {
        Integer a[]={3,2,10,12,4,2};
        int b[]={3,2};

        // int c[]=Arrays.copyOf(a,5);
        
        // for(var it:c)
        //    System.out.print(it+" ");

        System.out.println();

        Arrays.sort(a);
        Arrays.sort(a,new MyComp());

        for(var it:a)
           System.out.print(it+" ");

        System.out.println();

        //Arrays.fill(c,100);
        //System.out.println(Arrays.compare(a,b));
    }
}
