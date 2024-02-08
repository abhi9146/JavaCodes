public class wrapperClass {
    public static void main(String[] args) {
        // Different ways to write Integer object
        Integer a=Integer.valueOf(20);
        Integer b=30;
        
        Float c=Float.valueOf(20f);
        Float d=30f;

        Byte e=Byte.valueOf("23");
        Byte f=30;
        
        Short g=Short.valueOf("12");
        Short h=30;

        Character i=Character.valueOf('A');
        Character j='D';

        // Boxing
        Integer x=Integer.valueOf(20);
        // Auto Boxing 
        Integer y=20;

        // UnBoxing 
        int p=x.intValue();
        // Auto UnBoxing
        int q=x;

    }
}
