import java.util.Comparator;
import java.util.PriorityQueue;

class Mycomp implements Comparator<Integer>{
     public int compare(Integer a,Integer b){
         if(a<=b) return 1;
          return -1;
     }
}

public class priorityQueueProgram {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Mycomp());

        pq.add(40);pq.add(50);pq.add(60);pq.add(10);pq.add(20);
        
        System.out.println(pq.size());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());

        pq.forEach(x->{System.out.print(x+" ");});
        System.out.println();
        System.out.println(pq);

    }
}
