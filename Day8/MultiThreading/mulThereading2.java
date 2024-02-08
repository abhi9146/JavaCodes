
public class mulThereading2 extends Thread {
    public void run(){
        int i=0;
        while(i<5){
            System.out.println(i+ " Thread 1 ");
            i++;
        }
    }
    public static void main(String[] args) {
        mulThereading2 mt=new mulThereading2();
        mt.start();

        int i=0;
        while(i<5){
            System.out.println(i+ " main class ");
            i++;
        }
    }
}
