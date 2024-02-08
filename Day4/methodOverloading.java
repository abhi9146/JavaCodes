package Day4;

// Function with same name but different parameters and different return type
public class methodOverloading {
    static int add(int num1,int num2){
        return (num1+num2);
    }
    static float add(float num1,float num2){
        return (num1+num2);
    }
    static int add(int num1,int num2,int num3){
        return (num1+num2+num3);
    }
    public static void main(String[] args) {
        System.out.println("sum of two integer numbers is : "+add(10,20));
        System.out.println("sum of two float numbers is : "+add(10f,20f));
        System.out.println("sum of three integer numbers is : "+add(10,20,30));

    }
}
