package Day4;

public class methods {
    public static void main(String[] args) {
        int a=10,b=20;

        int larger=findMax(a,b);
        System.out.println("Larger element is : "+larger);
    }
    static int findMax(int a,int b){
        return a>b?a:b;
    }
}
