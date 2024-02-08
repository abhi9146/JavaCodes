import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int n=6;
        int arr[]={9,2,1,3,5,2};
        
        Arrays.sort(arr);

        int lo=0,hi=5,key=3,res=-1;
        while(lo<=hi){
           int mid=(lo+hi)/2;
           if(arr[mid]==key){
              res=mid;break;
           }
           else if(arr[mid]>key){
            hi=mid-1;
           }
           else lo=mid+1;
        }

        if(res==-1){
            System.out.println("Element not found");
        }
        else System.out.println("Element found at index :"+res);
    }
}
