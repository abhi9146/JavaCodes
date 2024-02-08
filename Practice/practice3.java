class template{
    int maxxi;
    int sum;
    float average;

    template(int a,int b,float c){
        sum=a;maxxi=b;average=c;
    }
}

class opertaions{
    public template calculate(int arr[],int n){
        int sum=0;
        int maxxi=Integer.MIN_VALUE;
        float s;

        for(int i:arr){ sum+=i;}
        for(int i:arr){
            maxxi=Math.max(i,maxxi);
         }
         s=((float)sum/n);

         template t=new template(sum,maxxi,s);
         return t;
    }
    
}
public class practice3 {
    public static void main(String[] args) {
        int n=6;
        int arr[]={9,2,1,3,5,2};
        
        opertaions o = new opertaions();
        template result = o.calculate(arr, n);

        // Printing the values
        System.out.println("Sum: " + result.sum);
        System.out.println("Maxxi: " + result.maxxi);
        System.out.println("Average: " + result.average);
    
    }
}
