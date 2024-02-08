import java.io.*;

public class bufferInputStream {
    
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Source1.txt");
        BufferedReader bis = new BufferedReader(new InputStreamReader(fis));

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.mark(10);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        // Read the rest of the line using readLine()
        String restOfTheLine = bis.readLine();
        if (restOfTheLine != null) {
            System.out.println("String " + restOfTheLine);
        }

        // Close the BufferedReader and FileInputStream
        bis.close();
        fis.close();
    }
}
