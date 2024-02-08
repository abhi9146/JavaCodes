package Day4;

public class findAreaOverloadedMethods {
   static int findArea(int side){
     return side*side;
   }
   static int findArea(int length,int breadth){
     return (length*breadth);
   }
  
    public static void main(String[] args) {
        System.out.println("Area of Square is: "+findArea(10));
        System.out.println("Area of rectangle is: "+findArea(10,5));
     }
}
