
abstract class temp{
   abstract void show();
}

class Outer{
     public void display(){
        temp t=new temp(){
             public void show(){
                System.out.println("show method");
             }
        };
        t.show();
     }
}
public class anonymousInnerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.display();
    }
}
