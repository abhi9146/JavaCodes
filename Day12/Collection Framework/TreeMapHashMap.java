import java.util.*;


public class TreeMapHashMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(2,"Ashish",3,"Abhishek"));
        tm.put(1,"Abhi");
        tm.put(4,"Devanshu");

        System.out.println(tm.containsKey(2));
        System.out.println(tm.containsValue("Abhi"));

        System.out.println(tm.keySet());
        tm.remove(3);
        System.out.println(tm);


        HashMap<Integer,String> hm=new HashMap<>(Map.of(2,"Ashish",3,"Abhishek"));
       
        System.out.println(hm);
        hm.put(6,"devid");
        hm.put(5,"Vishal");

        //hm.clear();
        System.out.println(hm);
    }
}
