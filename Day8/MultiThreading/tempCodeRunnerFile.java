
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