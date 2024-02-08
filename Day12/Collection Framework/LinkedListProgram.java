
import java.util.*;

public class LinkedListProgram {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(1);l1.add(2);
        l1.add(3);l1.add(4);

        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(3));

        for(var i:l1){
            System.out.print(i+" ");
        }

        l1.addFirst(100);
        l1.remove(2);
       
      System.out.println();
      System.out.println(l1);
    }
}
