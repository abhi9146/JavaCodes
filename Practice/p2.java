
import java.io.*;
import java.util.*;

class DuplicateFoundException extends Exception{

}
class VowelNotFoundException extends Exception{

}

public class p2 {
    public static boolean isVowel(char ch){
         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
         return false;
    }
    public static void method(String str){
        int n=str.length();
       
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(isVowel(str.charAt(i))==true){
                flag=true;
            }
        }
        try{
            if(flag==false){
                throw new VowelNotFoundException();
            }
        }
        catch(Exception e){
            System.out.println("Vowel not found exception");
        }
        
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // HashSet<Integer> hs= new HashSet<>();

        // int x;
        // while((x=sc.nextInt())!=-1){
        //   try{
        //       if(hs.contains(x)==true){
        //         throw new DuplicateFoundException();
        //        }
        //        hs.add(x);
        //   }
        //   catch(DuplicateFoundException e){
        //     System.out.println("Element already present");
        //   }
        //   System.out.println(hs);
        // }

        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        method(str);
    }
}
