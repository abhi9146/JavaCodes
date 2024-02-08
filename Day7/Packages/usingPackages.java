
import mypack.demo1;
import mypack.demo2;
import mypack.inner.demo3;

public class usingPackages {
    public static void main(String[] args) {
        demo1 d1=new demo1();
        d1.display();

        demo2 d2=new demo2();
        d2.display();

        demo3 d3=new demo3();
        d3.display();
    }
}
