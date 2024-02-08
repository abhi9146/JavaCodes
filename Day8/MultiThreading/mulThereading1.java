
class myThread extends Thread{
    public void run(){
        int i=0;
        while(i<5){
            System.out.println(i+ " Thread 1 ");
            i++;
        }
    }
}
public class mulThereading1 {
    public static void main(String[] args) {
        myThread mt=new myThread();
        mt.start();

        int i=0;
        while(i<5){
            System.out.println(i+ " main class ");
            i++;
        }
    }
}
