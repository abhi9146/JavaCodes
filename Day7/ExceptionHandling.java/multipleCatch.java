
public class multipleCatch {
    public static void main(String[] args) {
        int a[]={10,23,0,1,3};
        
        try{
            int c=a[0]/a[1];
            System.out.println(c);

            System.out.println(a[5]);
        }
        catch(ArithmeticException e){
           System.out.println("Divide by zero exception "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Invalid index "+e);
        }
    }
}
