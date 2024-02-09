import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;

public class multiThreadedServer extends Thread{
    Socket stk;
    public void run(){
         try{
            BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps=new PrintStream(stk.getOutputStream());

            String msg;
            StringBuilder sb;

            do{
                msg=br.readLine();

                sb=new StringBuilder(msg);
                sb.reverse();
                msg=sb.toString();

                ps.println(msg);
            }while(!msg.equals("dne"));
        }catch(Exception e){

        }
    }
    public multiThreadedServer(Socket s){
       stk=s;
    }
    public static void main(String[] args) throws Exception {
        ServerSocket ss= new ServerSocket(2000);
        Socket stk;
        
        do{
          stk=ss.accept();
          System.out.println("Client Connected");
          multiThreadedServer mt=new multiThreadedServer(stk);
          Thread t=new Thread(mt);
          t.start();
        }
        while(true);
    }
}

