
class Outer{
    public void display(){
       class Inner{
         public void show(){
            System.out.println("Inner function");
         }
       }
       Inner i=new Inner();
       i.show();
    }
}

public class localInnerClass{
     public static void main(String[] args) {
        Outer o=new Outer();
        o.display();
     }
}