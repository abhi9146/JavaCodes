abstract class hospital{
    abstract public void appointment();
    abstract public void billing();
    abstract public void medicalStore();
    abstract public void doctorsData();
}
class branch1 extends hospital{
    public void appointment(){ System.out.println("appointment counter");}
    public void billing() {System.out.println("billing is done here");}
    public void medicalStore() {System.out.println("medicines are brought from here");}
    public void doctorsData() {System.out.println("doctor details ");}
}
public class example {
    public static void main(String[] args) {
        hospital h=new branch1();
        h.appointment();
        h.billing();
        h.doctorsData();
        h.medicalStore();
    }
}
