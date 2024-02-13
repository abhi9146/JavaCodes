public class nestedTryCatch {
    public static void main(String[] args) {
        int a[]={10,23,0,1,3};
        
        try{
            try{
                int c=a[0]/a[2];
               System.out.println(c);
            }
            catch(ArithmeticException e){
                System.out.println("Divide by zero exception ");
             }
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Invalid index ");
        }
    }
}
