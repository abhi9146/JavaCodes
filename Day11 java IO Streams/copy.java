import java.io.*;
import java.util.Scanner;

public class copy {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Source1.txt");
        FileOutputStream fos = new FileOutputStream("Source2.txt");

        // File f=new File("Source2.txt");
        // Scanner sc=new Scanner(f);

        // while(sc.hasNext()){
        //   System.out.print(sc.nextInt()+" ");
        // }

        int x;
        while((x=fis.read())!=-1){
           if(x>=65 && x<=90){
             fos.write(x+32);
           }
           else{
            fos.write(x);
           }
        }

    }
}
