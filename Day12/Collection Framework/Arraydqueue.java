import java.util.*;

public class Arraydqueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(2);
        dq.offerLast(6);
        dq.offerLast(8);
        

        dq.offerFirst(10);
        dq.addFirst(80);

        System.out.println(dq.peek());
        System.out.println(dq.pollLast());
        System.out.println(dq.size());

        System.out.println(dq);
    }
}
