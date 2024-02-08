
abstract class Super{
    public Super(){
        System.out.println("Constructor of super class");
    }
    public void method1(){ System.out.println("method1 of Super class");}
    abstract public void method2();
}
class sub extends Super{
    public void method2(){
        System.out.println("overrided abstract method");
    }
}
public class abstractPractice {
    public static void main(String[] args) {
        Super s=new sub();
        s.method1();
        s.method2();
    }
}
