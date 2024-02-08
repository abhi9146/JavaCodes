
public class runableThreading2 implements Runnable {
    public void run(){
        int i=0;
        while(i<5){
            System.out.println(i+ " Thread 1 ");
            i++;
        }
    }
    public static void main(String[] args) {
        runableThreading2 m=new runableThreading2();
        Thread mt=new Thread(m);
        mt.start();

        int i=0;
        while(i<5){
            System.out.println(i+ " main class ");
            i++;
        }
    }
}
