
public class objectClass{
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=o1;
        Object o3=new Object();

        System.out.println(o1.toString());
        System.out.println(o1.hashCode());
        System.out.println(o1.equals(o3));
        System.out.println(o1.equals(o2));
        System.out.println(o1==o2);
    }
}