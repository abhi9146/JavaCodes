
interface temp{
    public void show();
}
class demo{
    // This global variable can be used in lambda expression and can be modified
    int cnt3=10;
    public void method(){
    int cnt2=20;  // this variable is used until its value is not modified means it works as final keyword value
        temp t=()->{
        // THis local variable can be used in lambda expression and can be modified
           int cnt1=30;
           cnt1++;
           System.out.println(cnt1);
           System.out.println(cnt2);
           System.out.println((++cnt3));
        };
        t.show();
    }
}
public class practiceLambda {
    public static void main(String[] args) {
       demo d=new demo();
       d.method();
    }
}
