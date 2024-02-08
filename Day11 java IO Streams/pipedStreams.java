import java.io.*;
import java.io.PipedOutputStream;
import java.io.PipedInputStream;

class producer extends Thread{
     OutputStream os;
     producer(OutputStream o){
         os=o;
     }
    
     public void run(){
     int cnt=1;
     while (true) {
        try{
            os.write(cnt);
            os.flush();

            System.out.println("Producer "+cnt);
            Thread.sleep(100);
        } 
        catch(Exception e){System.out.println(e);}
        cnt++;
     }
    }

}

class consumer extends Thread{
      InputStream is;
      consumer(InputStream i){
        is=i;
      }

      public void run(){
        int x;
        while(true) {
            try{
               x= is.read();

               System.out.println("Consumer "+x);
               Thread.sleep(100);
               System.out.flush();
            }
            catch(Exception e){System.out.println(e);}
        }
      }
}
public class pipedStreams {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        
        pos.connect(pis);

        producer p=new producer(pos);
        consumer c=new consumer(pis);

        p.start();
        c.start();

    }
}
