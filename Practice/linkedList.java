
class createLinkedList{
    public void display(){
        System.out.println("parent display method");
    }

}
class child extends createLinkedList{
    @Override
    public void display() {
        super.display();
    }
   
}
public class linkedList{
    public static void main(String[] args) {
        child c=new child();
        c.display();

    }
}
