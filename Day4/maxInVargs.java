package Day4;

public class maxInVargs{
    static void findMax(int ...arr){
         int maxxi=Integer.MIN_VALUE;
          for(int x:arr){
            maxxi=Math.max(maxxi,x);
          }
         System.out.println("Max Element is : "+maxxi);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,50};
        findMax(arr);
    }
}
