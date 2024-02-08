import java.util.Scanner;

public class swapNumberUsingXor {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    
      System.out.println("Enter two numbers to swap");
      int num1=sc.nextInt();
      int num2=sc.nextInt();
   
     System.out.println("Numbers before swapping");
     System.out.println("num1 : "+num1+" num2 : "+num2);
     
     // Xor opertaor 
     int num3=num1^num2;
     num1=num3^num1;
     num2=num3^num2;
    
     System.out.println("Numbers After swapping");
     System.out.println("num1 : "+num1+" num2 : "+num2);
     
     sc.close();
    }
}
