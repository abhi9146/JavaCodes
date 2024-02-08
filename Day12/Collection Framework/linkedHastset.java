
import java.util.*;

public class linkedHastset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(5);
        HashSet<Integer> h=new HashSet<>();
        TreeSet<Integer> ts=new TreeSet<>();

        lhs.add(20);lhs.add(-3);lhs.add(32);lhs.add(10);lhs.add(82);
        h.add(20);h.add(-3);h.add(32);h.add(10);h.add(82);
        ts.add(20);ts.add(-3);ts.add(32);ts.add(10);ts.add(82);

        System.out.println(lhs);
        System.out.println(h);
        System.out.println(ts);
    }
}
