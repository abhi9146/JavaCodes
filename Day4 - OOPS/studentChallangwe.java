
class Student{
    public int rollNo;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){
         return (m1+m2+m3);
    }
    public double average(){
        return (float)(m1+m2+m3)/3;
    }
    public char grade(){
       if(average()>=60){
         return 'A';
       }
       else if(average()>=50){
        return 'B';
       }
       else if(average()>=35) return 'C';
       else return 'F';
    }
}
public class studentChallangwe {
    public static void main(String[] args) {
        Student st=new Student();
        st.m1=46;
        st.m2=68;
        st.m3=10;

        System.out.println("total is : "+st.total());
        System.out.println("Average is : "+st.average());
        System.out.println("Grade is : "+st.grade());
    }
}
