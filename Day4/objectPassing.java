package Day4;

public class objectPassing {
    public static void change(int a[],int ind,int val) {
         a[ind]=val;
    }
    public static void main(String[] args) {
        int a[]={19,12,34,12,4};
        // Function to change value at index provided
        change(a,3,100);
     
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
