public class stringObjects {
    public static void main(String[] args) {
        String str1="abhi";
        String str3=str1;
        String str2=new String("abhi");

        // output is false since str1 will allocate memory in string pool while str2
        // will allocate memory in heap as well as pool 
        System.out.println(str1==str2); 
        // output is true since str1 and str2 will allocate memory in string pool
        System.out.println(str1==str3);
    }
}
