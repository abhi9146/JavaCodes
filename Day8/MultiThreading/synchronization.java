
class myData{
    synchronized public void display(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
   }
}

class thread1 extends Thread{
    myData d;
    thread1(myData d){
         this.d=d;
    }
    public void run(){
        d.display("Hello world ");
    }
}

class thread2 extends Thread{
    myData d;
    thread2(myData d){
         this.d=d;
    }
    public void run(){
        d.display("Abhishek ");
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
