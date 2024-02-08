package Day12.Generic;

public class genericMethods {
    static <E> void show(E[] list){
        for(E x:list){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show(new String[]{"hi","hello","bye"});
        show(new Integer[]{10,20,30});
    }
}
