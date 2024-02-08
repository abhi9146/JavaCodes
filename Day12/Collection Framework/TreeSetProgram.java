
import java.util.*;

public class TreeSetProgram {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(10);
        System.out.println(ts.contains(30));
        ts.add(500);
        ts.add(50);
        ts.add(100);ts.add(40);

        ts.remove(50);
        System.out.println(ts.first());

        System.out.println(ts);
    }
}
