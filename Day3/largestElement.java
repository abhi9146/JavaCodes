public class largestElement {
    public static void main(String[] args) {
        int arr[]={10,34,123,23,23};
       
        int max_ele=0;
        for(int i=0;i<arr.length;i++){
            if(max_ele<arr[i]) max_ele=arr[i];
        }
      System.out.println("Max element is : "+max_ele);
    }
}
