import java.io.*;

public class byteArrayInput {
    public static void main(String[] args) {
        byte b[]={'a','b','c','d','e','f','g','h','i','j'};

        ByteArrayInputStream in=new ByteArrayInputStream(b);

        System.out.println(in.readAllBytes());

    }
}
