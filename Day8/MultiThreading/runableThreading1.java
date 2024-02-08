
class myInterface implements Runnable{
    public void run(){
        int i=0;
        while(i<5){
            System.out.println(i+ " Thread 1 ");
            i++;
        }
    }
}
public class runableThreading1 {
    public static void main(String[] args) {
        myInterface m=new myInterface();
        Thread mt=new Thread(m);
        mt.start();

        int i=0;
        while(i<5){
            System.out.println(i+ " main class ");
            i++;
        }
    }
}
