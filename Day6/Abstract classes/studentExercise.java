abstract class Shape{
    abstract public void perimeter();
    abstract public void area();
}

class Circle extends Shape{
    private int radius;
    
    public Circle(int r){
        radius = r;
    }
    public void perimeter(){
         System.out.println("perimeter of circle is "+(2*Math.PI*radius));
    }
    public void area(){
        System.out.println("Area of circle is "+(Math.PI*radius*radius));
   }
}
class Rectangle extends Shape{
    private int length;
    private int breadth;
    
    public Rectangle(int l,int b){
        length = l;
        breadth=b;
    }
    public void perimeter(){
         System.out.println("perimeter of Rectangle is "+(2*(length+breadth)));
    }
    public void area(){
        System.out.println("Area of Rectangle is "+(length*breadth));
   }
}

public class studentExercise {
    public static void main(String[] args) {
        Shape c=new  Circle(10);
        c.perimeter();c.area();

        Shape r=new Rectangle(4, 10);
        r.perimeter();r.area();

    }
}
