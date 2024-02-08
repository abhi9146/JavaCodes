package Day12.Generic;

@SuppressWarnings("unchecked")
class MyArray<T>{
    T A[]=(T[]) new Object[10];
    int len=0;

    public void append(T v){
        A[len++]=v;
    }
    public void display(){
        for(int i=0;i<len;i++){
            System.out.println(A[i]);
        }
    }
}

public class genericArray{

    public static void main(String[] args) {
        MyArray<Integer> ma=new MyArray<>();

        ma.append(10);
        ma.append(20);
        ma.append(30);

        ma.display();
    }
}