package Day4;

public class sumInVargs {
    static void findSum(int ...arr){
        int sum=0;
         for(int x:arr){
           sum += x;
         }
        System.out.println("Sum of Elements is : "+sum);
   }
   public static void main(String[] args) {
       int arr[]={10,20,30,40,50,50};
       findSum(arr);
   }
}
