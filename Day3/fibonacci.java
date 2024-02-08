import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=0,second=1;

        System.out.println("Number of elements of fibonacci : ");
        int num=sc.nextInt();
      System.out.print(first+" "+second+" " );
        for(int i=2;i<num;i++){
             int third=first+second;
             first=second;
             second=third;
             System.out.print(second+" " );
        }

        sc.close();
    }
}
