
class myData{
    synchronized public void display(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
   }
}

class thread1 extends Thread{
    myData d;
    public thread1(myData d){
        this.d=d;
    }
    
    public void run(){
        d.display("Hello World");
    }
}

class thread2 extends Thread{
    myData d;
    public thread2(myData d){
        this.d=d;
    }
    
    public void run(){
        d.display("welcome");
    }
}

class synchronization {
    public static void main(String[] args) 
    {
        myData data=new myData();
        
        thread1 t1=new thread1(data);
        thread2 t2=new thread2(data);
        
        t1.start();
        t2.start();

    }    
}
