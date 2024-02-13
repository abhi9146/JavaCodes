//import java.lang.annotation.Annotation;

@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "14";
            }

@MyAnno(name="Abhishek",project="Ecommerce")
public class userDeinedAnotations 
{
    int data;

    public static void main(String[] args) 
    {
        int x;
    }
    
}