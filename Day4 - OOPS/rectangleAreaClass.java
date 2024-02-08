
class Rectangle{
     int length,breadth;
     public int area(){
        return (length*breadth);
     }
     public int perimeter(){
        return (2*length+2*breadth);
     }
}
public class rectangleAreaClass {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=10;

        System.out.println("Area of rectangle is : "+r.area());
        System.out.println("Perimeter of rectangle is : "+r.perimeter());
        
    }
}
