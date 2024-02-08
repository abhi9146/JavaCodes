
public class tryCatchfinally {
    public static void main(String[] args){
        int a[]={10,5,0,1,3};
        
        try{
            int c=a[0]/a[1];
            System.out.println(c);

            System.out.println(a[5]);
        }
        catch(Exception e){
           System.out.println("Exception : "+e);
        }
        finally{
            System.out.println("Finally block which is always executed");
        }
    }
}
