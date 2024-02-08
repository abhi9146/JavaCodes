
@FunctionalInterface
interface temp1{
    int add(int a,int b);
}
@FunctionalInterface
interface temp2{
    void print(String s);
}
public class parameters {
    public static void main(String[] args) {
        temp1 t1=(a,b)->(a+b);
        temp2 t2=(s)->System.out.println(s);

        System.out.println("Addition of numbers is : "+t1.add(10,20));
        t2.print("My name is abhi");
    }
}
