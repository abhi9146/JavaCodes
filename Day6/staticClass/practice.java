
class Outer{
    static int x=12;
    void display(){
       System.out.println("Hello");
    }
}
public class practice {
    public static void main(String[] args) {
        Outer o1=new Outer();
        Outer o2=new Outer();

        System.out.println(o1.x);
        System.out.println(o1.x);
        
        o1.x=20;
        System.out.println(o1.x);
        System.out.println(o1.x);
    }
}
