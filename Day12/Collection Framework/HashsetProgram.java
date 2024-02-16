
import java.util.*;

public class HashsetProgram {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();

        h.add(20);
        h.add(10);
        h.add(210);
        h.add(30);
        h.add(30);
        h.add(90);

        System.out.println(h.size());
        //h.clear();
        h.forEach((a)->System.out.println(a));

        //System.out.println(h);

    }
}
