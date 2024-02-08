class Practice{
    String name;
    // constructor without parameters
    public Practice(){
       name="default";
    }
    // constructor with parameters
    public Practice(String str){
        name=str;
    }
}
public class constructors {
    public static void main(String[] args) {
        Practice p1 = new Practice();
        System.out.println(p1.name);;
        Practice p2 = new Practice("Abhishek");
        System.out.println(p2.name);;
    }
}
