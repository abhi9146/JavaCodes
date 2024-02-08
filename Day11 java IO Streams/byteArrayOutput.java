
import java.io.*;

public class byteArrayOutput {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream out= new ByteArrayOutputStream(20);

        out.write('a');
        out.write('b');
        out.write('c');
        byte b[]=out.toByteArray();
        
        for(byte ch:b){
           System.out.print((char)ch);
        }
    }
}
