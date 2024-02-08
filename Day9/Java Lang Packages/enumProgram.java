
enum Dept{
     IT("john","DEPT A"),CSE("ABHI","DEPT B"),EXTC("DAVID","DEPT C");

    String name,location;
     private Dept(String name,String location){
         this.name=name;
         this.location=location;
     }

     public void display(){
        System.out.println(this.name+" "+this.ordinal());
     }
}

public class enumProgram {
    public static void main(String[] args) {
        Dept d=Dept.EXTC;
        d.display();
    }
}
