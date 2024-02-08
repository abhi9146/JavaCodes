
/*
   throw:
        throw is a keyword used in many programming languages, including Java, to explicitly throw an exception.
   throws:
        throws is used in the method signature in Java to declare that a method might throw certain types of exceptions. It is a part of the method declaration.
 * 
 */

public class throwException {
    static int meth3(int a,int b) throws Exception{
        if(b==0) throw new Exception();
        return a/b;
    }
    static void meth2() throws Exception{
        meth3(10,0);
    }
    static void meth1() throws Exception{
        meth2();
    }
    public static void main(String[] args) {
        try{
            meth1();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
