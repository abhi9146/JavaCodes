import java.io.*;


public class fileOutputStream {
    public static void main(String[] args) throws Exception  {
       
        // We can also do it using try with resources which will reduce the siz
      try(FileOutputStream fos = new FileOutputStream("C:/Courses/Programs/Day11 java IO Streams/Text.txt");){
        String str="My name is Abhishek";
        String str2="Software engineer intern @Connecticus technologies";

        byte brr[]=str2.getBytes();

        fos.write(str.getBytes());
        for(byte b:brr)
            fos.write(b);
      }
    //   catch(FileNotFoundException e){
    //     System.out.println(e);
    //   }
    //   catch(IOException e){
    //     System.out.println(e);
    //   }

    }
}
