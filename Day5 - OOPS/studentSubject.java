class Subject {
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subId, String name, int maxMarks) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public Subject(String subId, String name) {
        this.subId = subId;
        this.name = name;
   }

    public String getSubId() {return subId;}
    public String getName() {return name; }
    public int getMaxMarks() {return maxMarks;}
    public int getMarksObtained() {return marksObtained;}

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }
    public void printDetails(){
        System.out.println("SubId : "+subId);
        System.out.println("Name : "+name);
        System.out.println("Max Marks Required : "+maxMarks);
    }

    public boolean isQualified(int marks){
        return marks>=maxMarks;
    }
}



public class studentSubject {
    public static void main(String[] args) {
        Subject s[] = new Subject[3];
        s[0]=new Subject("MAT20","Mathematics",50);
        s[1]=new Subject("ENG21","English",80);
        s[2]=new Subject("HIN22","Hindi",70);
        
        for(Subject sub:s){
            sub.printDetails();
            System.out.println();
        }
    }
}
