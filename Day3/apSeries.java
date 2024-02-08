import java.util.Scanner;

public class apSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n,d,a;
        System.out.println("Enter number of elements , commom difference and start element : ");
        n=sc.nextInt();
        d=sc.nextInt();
        a=sc.nextInt();
        
        System.out.print("Elements in given ap are : ");
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            a+=d;
        }
        sc.close();
    }
}
