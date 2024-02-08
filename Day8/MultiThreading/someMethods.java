
class myThread extends Thread{
    public void run(){
        int i=0;
        while (true) {
            System.out.println(i+" myThread");
            i++;
        }
    }
}

public class someMethods {
    public static void main(String[] args) {
        myThread mt=new myThread();
      
        // daemon will restrict the running of thread and the threads will be terminated 
        // after the main theard is executed

         //mt.setDaemon(true);
        
         //try{Thread.sleep(100);}catch(Exception e){System.out.println(e);}
         //try{mt.join();}catch(Exception e){System.out.println(e);}

         mt.start();
         int i=0;
         // yield will stop the execution of the thread for the some time in which it is written so 
         // the other threads will get executed for more time
         while(true){
            System.out.println(i+" main thread ");i++;
            Thread.yield();
         }
        
    }
}
