interface Demo{
    void meth1();
    default void meth2(){
        System.out.println("In default method");
    }
    static void meth3(){
        System.out.println("In static method");
    }
}

class sub implements Demo{
    public void meth1(){
        System.out.println("meth1 overridden");
    }
}
public class defaultStaticInterface {
    public static void main(String[] args) {
        Demo d=new sub();
        d.meth1();d.meth2();
        Demo.meth3();
        
        // Lambda expression since my class contain only single abstract method
        Demo d1 = ()->  System.out.println("meth1 overridden using lambda expression");
        d1.meth1();
    }
}
