import java.io.*;
import java.net.*;

public class echoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss= new ServerSocket(2000);
        Socket stk=ss.accept();

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
        stk.close();
    }
}
