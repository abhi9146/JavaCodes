import java.util.Scanner;

public class gpSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n,r,a;
        System.out.println("Enter number of elements , commom ratio and start element : ");
        n=sc.nextInt();
        r=sc.nextInt();
        a=sc.nextInt();
        
        System.out.print("Elements in given ap are : ");
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            a*=r;
        }
        sc.close();
    }
}
