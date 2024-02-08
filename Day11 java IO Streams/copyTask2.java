import java.io.*;

public class copyTask2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis1 = new FileInputStream("Source1.txt");
        FileInputStream fis2 = new FileInputStream("Source2.txt");

        FileOutputStream fos2=new FileOutputStream("Destination.txt");

        SequenceInputStream sis= new SequenceInputStream(fis1,fis2);

        int x;
        while((x=sis.read())!=-1){
            fos2.write(x);
        }

        fis1.close();
        fis2.close();
        sis.close();
        fos2.close();

    }
}
