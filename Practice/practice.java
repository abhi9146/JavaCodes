import java.util.Scanner;
class tmp{
    public boolean isPrime(int number){
        if (number <= 1) {
            return false;
        } 

        for(int i =2; i<Math.sqrt(number); i++){
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }
}
public class practice {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        
        tmp t=new tmp();
        if (t.isPrime(number)) {
            System.out.println(number + " Prime number");
        }else{

            System.out.println(number+ " Not prime number");
        }
    }
}