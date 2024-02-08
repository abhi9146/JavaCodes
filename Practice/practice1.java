import java.util.Scanner;

public class practice1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int firstMax=Integer.MIN_VALUE , secondMax=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(firstMax<arr[i]){
                secondMax=firstMax;
                firstMax=arr[i];
            }
            else if(secondMax<arr[i]){
               secondMax=arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
