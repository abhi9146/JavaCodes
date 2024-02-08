package Day12.Generic;

@SuppressWarnings("unchecked")
public class generics<T> {
    T data[]=(T[]) new Object[3];
    
    public static void main(String[] args) {
        generics<Integer> gd=new generics<>();

        gd.data[0]=10;
        gd.data[1]=20;
        gd.data[2]=30;

       for(int i=0;i<3;i++)
         System.out.println(gd.data[i]);
    }
}
