package Day4;

import java.util.Scanner;

public class fiboncciRecurssion {
    static void printFibonacciSeries(int first,int second,int num){
        if(num==0){
            return;
        }
       int curr=first+second;
       first=second;
       second=curr;

       System.out.print(second+" ");
       printFibonacciSeries(first, second, num-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements required : ");
        int n=sc.nextInt();

        System.out.print(0+" "+1+" ");
        printFibonacciSeries(0,1,n-2);

        sc.close();
    }
}
