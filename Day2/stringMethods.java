
public class stringMethods {
    public static void main(String[] args) {
        String str1="abhishek" ,str2="AbhisHek",str3="   hello   ";
        // convert each character of string to upper case 
        System.out.println(str1.toUpperCase());
        // convert each character of string to lower case 
        System.out.println(str2.toLowerCase());
        // remove blank spaces from left and right
        System.out.println(str3.trim());

        // substring from index i provided as parameter
        System.out.println(str1.substring(2));

        // equals and ==
        String a="abhi";
        String b="abhi";

        String c=new String("abhi");
        
        //   .equals to check for value while "==" checks reference 
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a.equals(c));
        System.out.println(a==c);
   }    
}