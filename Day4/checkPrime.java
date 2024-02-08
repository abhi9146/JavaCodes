package Day4;

import java.util.Scanner;

public class checkPrime {
    static boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if((num%i) ==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();

        boolean t=isPrime(num);
        if(t==true){
            System.out.println("Given number is a prime number");
        }
        else{
            System.out.println("Given number is a not prime number");
        }
        sc.close();
    }
}
