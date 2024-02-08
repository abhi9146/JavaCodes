import java.util.*;

public class ArrayListProgram {
    public static void main(String[] args) {

        // Different ways to declare arraylist
        ArrayList<Integer> arr1 = new ArrayList<>(20);
        ArrayList<Integer> arr2 = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(80,90,100));


        arr1.add(10); arr1.add(20); arr1.add(30);
        arr1.add(1,200);
        arr3.addAll(arr2);
        
        System.out.println(arr2.indexOf(80));
        System.out.println(arr3.contains(2));
        //arr3.clear();

        for(int i=0;i<arr3.size();i++){
            System.out.print(arr3.get(i)+" ");
        }
        System.out.println();
        for(var x:arr3){
            System.out.print(x+" ");
        }
        System.out.println();
        arr3.forEach(x->System.out.print(x*x+" "));

        System.out.println();
        Collections.sort(arr3);  // Sort the arrayList in ascending order
        System.out.println(arr3);

        Collections.sort(arr3,Collections.reverseOrder());  // Sort and Reverse the arrayList
        Collections.reverse(arr3);  // Reverse the arrayList
        System.out.println(arr3);

        // System.out.println(arr1);
        // System.out.println(arr2);
        // System.out.println(arr3);
    }
}
