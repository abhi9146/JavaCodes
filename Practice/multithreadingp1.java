
class Counter{
    int cnt;
    public Counter(int c){
        cnt=c;
    }

    synchronized public void increment(){
        cnt++;
    }
    synchronized public void decrement(){
        cnt--;
    }
    synchronized public void getCount(){
       System.out.println(cnt);
    }
}

class thread1 extends Thread{
    Counter c;
    public thread1(Counter c){
        this.c=c;
    }
    public void run(){
        int i=0;
        while(i<10){
       c.increment();
       c.getCount();i++;
       try{
         Thread.sleep(2000);
       }catch(Exception e){System.out.println(e);}
    }
    }
}

class thread2 extends Thread{
    Counter c;
    public thread2(Counter c){
        this.c=c;
    }
    public void run(){
    int i=0;
      while(i<10){
       c.decrement();
       c.getCount();i++;
       try{
        Thread.sleep(2000);
      }catch(Exception e){System.out.println(e);}
    }
    }
}

public class multithreadingp1 {
    public static void main(String[] args) {
        Counter c=new Counter(0);
        
        thread1 t1=new thread1(c);
        thread2 t2=new thread2(c);

        t1.start();
        t2.start();

        //System.out.println(c.getCount());
    }
}
