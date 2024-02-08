class Cylinder{
    private double radius;
    private double height;

    Cylinder(){
        radius=0;height=0;
    }
    Cylinder(double r,double h){
        radius=r;height=h;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    } 
    public void setRadius(double r){
        radius=r;
    }
    public void setHeight(double h){
        height=h;
    }
    public void setDimensions(double r,double h){
        radius=r;
        height=h;
    }
    public double area(){
         double a=2*Math.PI*radius*(radius+height);
         return a;
    }
}
public class studentChallangeCylinder {
    public static void main(String[] args) {
        Cylinder c=new Cylinder(4,6);
        System.out.println("Radius is :" + c.getRadius() );
        c.setHeight(30);
        System.out.println("Height is : "+c.getHeight());

        System.out.println("Area is : "+c.area());
    }
}
