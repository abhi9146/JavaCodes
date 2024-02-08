
interface Test{
    void meth1();
    void meth2();
}

class temp implements Test{
    public void meth1(){
        System.out.println("meth1 declared");
    }
    public void meth2(){
        System.out.println("meth2 declared");
    }
}
public class interfacePractice {
    public static void main(String[] args) {
        Test t=new temp();
        t.meth1();t.meth2();
    }
}
