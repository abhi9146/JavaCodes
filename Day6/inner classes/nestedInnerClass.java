
class outer{
    int x=10;

    class inner{
        int y=20;
        public void innerDisplay(){
            System.out.println("values of x & y are "+x+" "+y);
        }
    }
    void outerDisplay(){
        inner i=new inner();
        i.innerDisplay();

        System.out.println(i.y);
    }
}
public class nestedInnerClass {
    public static void main(String[] args) {
        outer o=new outer();
        o.outerDisplay();

        System.out.println("Value of x is "+o.x);
    }
    
}
