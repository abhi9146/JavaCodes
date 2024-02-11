import java.util.Scanner;

import org.w3c.dom.events.EventException;

import java.io.*;

class oddNumException extends Exception{
}
class PosNumException extends Exception{
}
class p1{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        // try{
        //    if(num%2!=0) 
        //        throw new oddNumException();
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Divide by zero");
        // }
        // catch(oddNumException e){
        //     System.out.println("Odd Number Exception");
        // }
        // catch(Exception e){
        //     System.out.println("Other exception");
        //     System.out.println(e);
        // }
       
        // try{
        //     FileInputStream fis=new FileInputStream("../Day11 java IO Streams/Test.txt");
        //     int x;
        //     while((x=fis.read())!=-1){
        //         System.out.print((char)x);
        //     }
        //     fis.close();
        // }
        // catch(FileNotFoundException e){
        //     System.out.println(e);
        // }
        // catch(IOException e){
        //     System.out.println(e);
        // }

        try{
            File f=new File("../Day11 java IO Streams/Text.txt");
            Scanner sc=new Scanner(f);

            if(sc.hasNext()){
               String str=sc.nextLine();
            //    if(num>0){
            //     throw new PosNumException();
            //    }
            System.out.println(str);
            }
            else throw new PosNumException();
            System.out.println("ALL NEGATIVE");
            
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(PosNumException e){
            System.out.println("Null file");
        }
    }
}