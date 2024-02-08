class Circle{
    public double radius;
    
    public double area(){
        return Math.PI * radius *radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

// child class inheriting the properties from circle parent class
class Cylinder extends Circle{
    public double height;
    
    public double volume(){
        return area()*height;
    }
    
}

public class inheritance{
       public static void main(String[] args) {
           Cylinder c=new Cylinder();
           c.radius=20;
           c.height=8;
           System.out.println("Volume is "+c.volume());
           System.out.println("Area is "+c.area());
          
       }
}  
