class Super{
    public void method1(){ System.out.println("super Method 1 called"); }
    public void method2(){ System.out.println("super Method 2 called"); }
}

/// while inheriting from one class to another class 
// if we are doing method overriding then the acces modifier of subclass must be less than or equal to parent class
// it should not be more strict than its parent class
// if i will make method 2 in Super class private it will give error

class child extends Super{    
    @Override
    public void method2(){ System.out.println("child Method 2 called"); }
    public void method3(){ System.out.println("child Method 3 called"); }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        Super s=new child();
        s.method1();
        s.method2();
    }
}
