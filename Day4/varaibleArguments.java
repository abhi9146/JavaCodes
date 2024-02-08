package Day4;

public class varaibleArguments {
    static void fun(int ...arr){
          for(int x:arr){
            System.out.print(x+" ");
          }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,50};
        fun(arr);
    }
}
