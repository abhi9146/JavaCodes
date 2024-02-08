
@FunctionalInterface
interface temp {
   void show();    
}

public class lambda {
    public static void main(String[] args) {
        temp t=()->System.out.println("Show method overided");
        t.show();
    }
}
