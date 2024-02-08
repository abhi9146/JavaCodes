
class Cylinder{
    public double radius,height;
    public double lidArea(){
       return (Math.PI*radius*radius);
    }
    public double totalSurfaceArea(){
       return (2*lidArea()+circumference()*height);
    }
    public double circumference(){
        return (2*Math.PI*radius);
    }
    public double volume(){
        return (lidArea()*height);
    }
}
public class cylinderAreaClass {
   public static void main(String[] args) {
       Cylinder c=new Cylinder();
       c.radius=10;
       c.height=9;

       System.out.println("lidArea of cylinder is : "+c.lidArea());
       System.out.println("Total area of cylinder is : "+c.totalSurfaceArea());
       System.out.println("circumference of cylinder is : "+c.circumference());
       System.out.println("volume of cylinder is : "+c.volume());
       
   }
}
