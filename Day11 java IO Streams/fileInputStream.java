
import java.io.*;

public class fileInputStream {
    public static void main(String[] args) throws Exception {
        
        // If we will update the FileInputStream to FileReader and FileOutputStream to FileWriter it will work similarly
        
        try( FileInputStream fis=new FileInputStream("C:/Courses/Programs/Day11 java IO Streams/Text.txt");){
            // byte[] b=new byte[fis.available()];
           
            // fis.read(b);
            // String str=new String(b);
            // System.out.println(str);
            
            int x;
            while((x=fis.read())!=-1){
                System.out.print((char)x);
            }
            fis.close();
        }
    }
}
