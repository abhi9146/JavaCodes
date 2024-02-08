import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n=6;

        int arr[]={9,2,1,3,5,2};
        // for(int i=0;i<n;i++){
        //     arr[i]=s.nextInt();
        // }
        
        boolean flag=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                 if(arr[j]>arr[j+1]){
                    flag=true;
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                 }
            }
            if(flag==false) break;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
