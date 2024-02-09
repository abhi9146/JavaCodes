
import java.net.*;
import java.io.*;

public class echoClient {
    public static void main(String[] args) throws Exception {
        Socket stk= new Socket("192.168.235.1",2000);
       
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());

        String msg;

        do{
             msg=keyb.readLine();
             ps.println(msg);
             msg=br.readLine();

             System.out.println("From Server :"+msg);

        }while(!msg.equals("dne"));
        stk.close();
    }
}