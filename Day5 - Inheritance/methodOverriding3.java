class car{
    public void start(){ System.out.println("Car started");}
    public void accelerate(){ System.out.println("Car accelerated");}
    public void changeGear(){ System.out.println("Gear changed");}
 
}

class luxuryCar extends car{
    public void changeGear(){System.out.println("Luxury car gear changed");}
    public void openRoof(){System.out.println("Luxury car roof opened");}
}
public class methodOverriding3 {
   public static void main(String[] args) {
        // car c= new car();
        // c.start();
        // c.accelerate();
        // c.changeGear();

        // luxuryCar c= new luxuryCar();
        // c.start();
        // c.accelerate();
        // c.changeGear();
        // c.openRoof();

        car c= new luxuryCar();
        c.start();
        c.accelerate();
        c.changeGear();
   }   
}
