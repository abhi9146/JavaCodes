
class parent{
    public parent(){
    System.out.println("parent class constructor");
    }
    public void display(){
        System.out.println("parent display function");
    }
}
class child extends parent{
    public child(){
        System.out.println("child class constructor");
    }
    public void display(){
        System.out.println("child display function");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        parent c=new child();
        c.display();
    }
}
