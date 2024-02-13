
import java.io.*;

class Student implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    
    public Student(int r,String n,float a,String d){
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
    }
    
    public String toString(){
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+"\n";
    }
    
}

public class serialization 
{
    // public static void main(String[] args) throws Exception
    // {
    //     FileOutputStream fos=new FileOutputStream("Student3.txt");
    //     ObjectOutputStream oos=new ObjectOutputStream(fos);
        
    //     Student s=new Student(10,"John",89.9f,"CSE");
        
    //     oos.writeObject(s);
        
    //     fos.close();
    //     oos.close();
        
    // }
    
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("Student3.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Student s=(Student)ois.readObject();
        
        System.out.println(s);
        
        fis.close();
        ois.close();
        
    }
}