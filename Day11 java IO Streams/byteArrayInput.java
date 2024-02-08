import java.io.*;

public class byteArrayInput {
    public static void main(String[] args) {
        byte b[]={'a','b','c','d','e','f','g','h','i','j'};

        ByteArrayInputStream in=new ByteArrayInputStream(b);

        int x;
        while((x=in.read())!=-1){
            System.out.print((char)x);
        }
        System.out.println();
        System.out.println(in.markSupported());
        // String s=new String(in.readAllBytes());
        // System.out.println(s);

    }
}
