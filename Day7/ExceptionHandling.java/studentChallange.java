class stackOverflowException extends Exception{
      public String toString(){
        return "Stack Overflow ( Stack is full)";
      }
}

class stackUnderflowException extends Exception{
    public String toString(){
      return "Stack Underflow ( Stack is empty)";
    }
}

class Stack {
    private int size;
    private int top;
    private int arr[];

    public Stack(int n){
        size = n;
        top=-1;
        arr=new int[size];
    }
    public void pop() throws stackUnderflowException{
        if(top==-1){
            throw new stackUnderflowException();
        }
        System.out.println("Top element was "+arr[top]);
        top = top-1;
    }
    public void push(int num) throws stackOverflowException{
        if(top==(size-1)){
            throw new stackOverflowException();
        }
        top = top+1;
        arr[top]=num;
        System.out.println("Element inserted");
    }
}
public class studentChallange {
    public static void main(String[] args) {
        Stack st= new Stack(5);
        try{
            st.push(10);
            st.push(20);
            st.pop();st.pop();
            st.pop();
        }
        catch(Exception e){
          System.out.println(e);
        }
        
    }
}
