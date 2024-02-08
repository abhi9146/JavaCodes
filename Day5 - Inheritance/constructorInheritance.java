
class parent{
   public parent(){
    System.out.println("parent constructor");
   }
}

class child extends parent{
    public child(){
     System.out.println("child constructor");
    }
}

class grandChild extends child{
    public grandChild(){
     System.out.println("grandChild constructor");
    }
}
public class constructorInheritance {
    public static void main(String[] args) {
        grandChild c=new grandChild();
    }
}
