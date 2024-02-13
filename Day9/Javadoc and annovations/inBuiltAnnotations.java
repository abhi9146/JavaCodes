
class A{
    public void display(){
        System.out.println("display method");
    }
}

class B extends A{
    @Override  
    public void display(){
        
    }
    @Deprecated
    public void show(){
        
    }
}

public class inBuiltAnnotations {
        public static void main(String[] args){
        int i;
        @SuppressWarnings("deprecation")
        B b=new B();
        b.show();
    }   
}