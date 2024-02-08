import java.util.Scanner;

public class firstJavaProgram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            String name=sc.next();
            System.out.println(name);
        }
        sc.close();
    }
}