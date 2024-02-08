
class Outer{
    int x=10;
    static int y=20;

    static class temp{
        public void show(){
            System.out.println(y);
        }
    }
}
public class staticInnerClass {
    public static void main(String[] args) {
        Outer.temp t=new Outer.temp();
        t.show();
    }
}
