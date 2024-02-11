
class Vehicle{
    public void drive(){
        System.out.println("Vehicle drive method");
    }
}

class sub extends Vehicle{
    public void drive(){
        System.out.println("sub drive method");
    }
    public void meth(){
        System.out.println("hello");
    }
}

public class p3 {
    public static void main(String[] args){
         Vehicle v=new sub();
         v.drive();
    }
}
