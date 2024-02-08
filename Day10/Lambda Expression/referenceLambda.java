
interface myLambda1{
    public int display(String  a,String b);
}
interface myLambda2{
    public void display(String  a);
}
interface myLambda3{
    public void display(String  a);
}
public class referenceLambda {
    public  referenceLambda(String s){
        System.out.println(s.toUpperCase());
    }
    public static void show(String s){
       System.out.println("Hello");
    }
    public static void main(String[] args) {
        myLambda1 a= String::compareTo;
        System.out.println(a.display("abhi", "abhishek"));

        myLambda2 b=referenceLambda::new;
        myLambda3 c=referenceLambda::show;

       b.display("hello abhi");
       c.display("hello there");

    }
}
