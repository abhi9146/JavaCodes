import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class StringTokenization {
    public static void main(String[] args) throws Exception{
        //String str="name=Abhishek;age=22;home=bhokar;school=sggs";
        FileInputStream fis=new FileInputStream("input.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
         String str=new String(b);
 
        StringTokenizer s=new StringTokenizer(str,",");
        
        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
    }
}
