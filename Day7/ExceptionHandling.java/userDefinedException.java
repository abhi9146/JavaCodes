import java.util.Scanner;

class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimensions of a rectangle can not be negative ";
    }
}

public class userDefinedException {
    static int area(int l, int b) throws NegativeDimensionException{
        if(l<0 || b<0) throw new NegativeDimensionException();
        
        return (l*b);
    }

    static void meth1(int l,int b){
        try{
            int a=area(l,b);
            System.out.println("Area is : "+a);
        }
        catch(NegativeDimensionException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle ");
        int l=sc.nextInt();
        int b=sc.nextInt();

        meth1(l,b);

        sc.close();
    }
}
