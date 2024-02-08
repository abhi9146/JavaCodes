public class stringCreation {
    public static void main(String[] args) {
        String str1=new String("Hello");
        StringBuffer str2=new StringBuffer("Hello");
        StringBuilder str3=new StringBuilder("Hello");

        str1.concat(" World");
        str2.append(" World");
        str3.append(" World");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
