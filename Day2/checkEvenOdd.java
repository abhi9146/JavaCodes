
import java.util.Scanner;

public class checkEvenOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        
        if((num&1)==0){
            System.out.println("Given number is Even");
        }
        else System.out.println("Given number is odd");
        sc.close();
    }
}
