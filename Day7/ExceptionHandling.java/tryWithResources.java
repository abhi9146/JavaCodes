import java.io.*;
import java.util.*;

public class tryWithResources { 
    static void Divide() throws Exception{
        try(FileInputStream fi=new FileInputStream("C:/Users/Abhishek/Desktop/Notes/input.txt");Scanner sc=new Scanner(fi) ){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }
    }
    
    public static void main(String[] args) throws Exception{
        try{
          Divide();
        }
        catch(Exception e){
            System.out.println(e);
        }  
    }
    
}