package Day4;
import java.util.Scanner;

public class gcd {
    static int findGCD(int a,int b){
        if(b==0) return a;
        return findGCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two number : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        System.out.println("Gcd of num1 & num2 is : "+findGCD(num1,num2));
        sc.close();
    }
}
